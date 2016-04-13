package com.mmnaseri.utils.spring.data.proxy.impl.adapters;

import com.mmnaseri.utils.spring.data.domain.Invocation;

/**
 * @author Milad Naseri (mmnaseri@programmer.net)
 * @since 1.0 (9/24/15)
 */
public class VoidResultAdapter extends AbstractResultAdapter<Object> {

    public VoidResultAdapter() {
        super(Integer.MIN_VALUE);
    }

    @Override
    public boolean accepts(Invocation invocation, Object originalValue) {
        return void.class.equals(invocation.getMethod().getReturnType());
    }

    @Override
    public Object adapt(Invocation invocation, Object originalValue) {
        return null;
    }

}
