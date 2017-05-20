package io.crnk.legacy.repository.annotations;

import java.lang.annotation.*;

/**
 * <p>
 * Method annotated with this annotation will be used to add relationship resources to a particular document. The method
 * must be defined in a class annotated with {@link JsonApiRelationshipRepository}.
 * </p>
 * <p>
 * The requirements for the method parameters are as follows:
 * </p>
 * <ol>
 * <li>Instance of a source document</li>
 * <li>{@link Iterable} of relationships to be add</li>
 * <li>Relationship's filed name</li>
 * </ol>
 * <p>
 * The method's return value should be <i>void</i>.
 * </p>
 *
 * @see io.crnk.legacy.repository.RelationshipRepository#addRelations(Object, Iterable, String)
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface JsonApiAddRelations {
}