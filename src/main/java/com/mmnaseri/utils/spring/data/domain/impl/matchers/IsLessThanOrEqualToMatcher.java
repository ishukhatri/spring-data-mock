package com.mmnaseri.utils.spring.data.domain.impl.matchers;

import com.mmnaseri.utils.spring.data.domain.Parameter;

/**
 * This will check to see if the value on the object is less than the or equal to argument being passed
 * (the pivot).
 *
 * @author Milad Naseri (mmnaseri@programmer.net)
 * @since 1.0 (9/29/15)
 */
public class IsLessThanOrEqualToMatcher extends AbstractSimpleComparableMatcher {

    @Override
    protected boolean matches(Parameter parameter, Comparable actual, Comparable pivot) {
        //noinspection unchecked
        return actual != null && pivot != null && pivot.compareTo(actual) >= 0;
    }

}
