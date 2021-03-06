package io.ciera.runtime.template.util;

import io.ciera.runtime.summit.exceptions.XtumlException;

public interface ITemplate {

    public void evaluate(Object ... symbols) throws XtumlException;

}
