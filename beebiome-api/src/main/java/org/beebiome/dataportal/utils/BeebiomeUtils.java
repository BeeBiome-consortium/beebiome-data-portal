package org.beebiome.dataportal.utils;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BeebiomeUtils {

    public static <T> Set<T> getUnmodifiableSet(Collection<T> set) {
        return Collections.unmodifiableSet(set == null ? new HashSet<>(): new HashSet<>(set));
    }
}
