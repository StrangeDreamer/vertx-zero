package org.vie.exception.run;

import org.vie.exception.ZeroRunException;

import java.text.MessageFormat;

public class EmptyStreamException extends ZeroRunException {

    public EmptyStreamException(final String filename) {
        super(MessageFormat.format(Info.NIL_MSG, filename, null));
    }

    public EmptyStreamException(final String filename, final Throwable ex) {
        super(MessageFormat.format(Info.NIL_MSG, filename, ex.getCause()));
    }
}