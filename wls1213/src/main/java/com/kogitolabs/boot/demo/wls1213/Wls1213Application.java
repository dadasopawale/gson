package com.kogitolabs.boot.demo.wls1213;

import java.io.IOException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@SpringBootApplication
public class Wls1213Application extends SpringBootServletInitializer implements WebApplicationInitializer {
	public static final Gson gsonWithAdapters() {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Integer.class, INT_ADAPTER)
                .registerTypeAdapter(int.class, INT_ADAPTER)
                .registerTypeAdapter(Boolean.class, BOOL_ADAPTER)
                .registerTypeAdapter(boolean.class, BOOL_ADAPTER)
                .create();
        return gson;
    }
	
    public static void main(String[] args) {
       //SpringApplication.run(Wls1213Application.class, args);
        
    	Gson gson = gsonWithAdapters();
       
        AmendmentDto amendmentDto = new AmendmentDto();
        amendmentDto.setBankStatementFileId("12345");
        Codebeautify codebeautify=  new Codebeautify();
        		codebeautify.setAmendmentDto(amendmentDto);
        String json = gson.toJson(codebeautify);
        
        System.out.println(json);
    }
    

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Wls1213Application.class);
    }
    private static final TypeAdapter<Integer> INT_ADAPTER = new TypeAdapter<Integer>() {
        @Override public void write(final JsonWriter out, final Integer value) throws IOException {
            if (value == -1) {
                out.nullValue();
            } else {
                out.value(value);
            }
        }
        @Override public Integer read(final JsonReader in) throws IOException {
            return in.nextInt();
        }

    };
    
    static final TypeAdapter<Boolean> BOOL_ADAPTER = new TypeAdapter<Boolean>() {
        @Override public void write(final JsonWriter out, final Boolean value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(value);
            }
        }
        @Override public Boolean read(final JsonReader in) throws IOException {
            return in.nextBoolean();
        }
    };
}
