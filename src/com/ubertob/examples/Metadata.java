package com.ubertob.examples;

import java.util.Objects;


public class Metadata {

    public static String extractClassMetadata(final Class classToInvokeInlineMethodsOn)
    {
        Objects.requireNonNull("Provided Class must be non-null to extract its metadata.");

        final String className = classToInvokeInlineMethodsOn.getSimpleName();

        final String outputPrefix = "\n" + className + ".class.";

        return outputPrefix + "getName(): " + classToInvokeInlineMethodsOn.getName()

                + outputPrefix + "getSimpleName(): " + classToInvokeInlineMethodsOn.getSimpleName()

                + outputPrefix + "getCanonicalName(): " + classToInvokeInlineMethodsOn.getCanonicalName()

                + outputPrefix + "toGenericString(): " + classToInvokeInlineMethodsOn.toGenericString()

                + outputPrefix + "getTypeName(): " + classToInvokeInlineMethodsOn.getTypeName()

                + outputPrefix + "getComponentType(): " + classToInvokeInlineMethodsOn.getComponentType()

                + outputPrefix + "isInlineClass(): " + classToInvokeInlineMethodsOn.isInlineClass()

                + outputPrefix + "isIndirectType(): " + classToInvokeInlineMethodsOn.isIndirectType()

                + outputPrefix + "isNullableType(): " + classToInvokeInlineMethodsOn.isNullableType()

                + outputPrefix + "isPrimitive(): " + classToInvokeInlineMethodsOn.isPrimitive();
//
//                + outputPrefix + " final?: " + isFinal(classToInvokeInlineMethodsOn);

    }

}
