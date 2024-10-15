package com.gfunk77.login3.exception;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(Long id, Class<?> entity) {
        super("The " + entity.getSimpleName().toLowerCase() + " with id: " + id +
                " does not exist in our records");
    }
}
