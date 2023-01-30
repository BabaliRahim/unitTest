package com.example.unittest;

import com.example.unittest.service.ToDoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
// Main class
public class TodoServiceImplMockTest {
    TodoServiceImplMockTest todoBusiness;
    @Mock
    ToDoService todoServiceMock;


    @Before
    public void setUp() {
        todoBusiness = new TodoServiceImplMockTest(todoServiceMock);
    }
    @Test
    public void testRetrieveTodosRelatedToSpring_usingMock() {
        List<String> todos
                = Arrays.asList("Learn Spring", "Lear Java",
                "Learn Spring Boot");
        when(todoServiceMock.retrieveToDos("User"))
                .thenReturn(todos);
        List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToJaw(
                "User");
        assertEquals(1, filteredTodos.size());
    }
    @Test
    public void testRetrieveTodosRelatedToSpring_withEmptyList_usingMock()
    {
        List<String> todos = Arrays.asList();
        when(todoServiceMock.retrieveToDos("Dummy"))
                .thenReturn(todos);
        List<String> filteredTodos
                = todoBusiness.retrieveTodosRelatedToJava(
                "Dummy");
        assertEquals(0, filteredTodos.size());
    }
}