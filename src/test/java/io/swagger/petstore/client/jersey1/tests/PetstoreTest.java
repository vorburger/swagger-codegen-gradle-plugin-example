package io.swagger.petstore.client.jersey1.tests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.swagger.petstore.client.jersey1.ApiClient;
import io.swagger.petstore.client.jersey1.ApiException;
import io.swagger.petstore.client.jersey1.api.PetApi;
import io.swagger.petstore.client.jersey1.model.Pet;

public class PetstoreTest {
	
    @Test public void testSomeLibraryMethod() throws ApiException {
		ApiClient apiClient = new ApiClient();
		apiClient.setBasePath("http://petstore.swagger.io/v2");
		PetApi petApi = new PetApi(apiClient);
		Pet pet = petApi.getPetById(1L);
		assertEquals("a", pet.getName());
    }

}
