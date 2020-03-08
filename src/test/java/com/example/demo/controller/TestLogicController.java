package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
public class TestLogicController {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void whenGetExampleDataWith1_ShouldResponseExample1() throws Exception {
        // Action
        MvcResult result = this.mockMvc.perform(get("/exampleData/1")).andExpect(status().isOk()).andReturn();
        String messages = result.getResponse().getContentAsString();
        ObjectMapper map = new ObjectMapper();
        JsonNode node = map.readTree(messages);

        // Assert
        assertEquals(node.get("responseMessage").asText(), "example 1");
    }
}