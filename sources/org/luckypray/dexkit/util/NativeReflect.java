package org.luckypray.dexkit.util;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class NativeReflect {
    public static final native Field getReflectedField(Class<?> cls, String str, String str2, Boolean bool);

    public static final native Member getReflectedMethod(Class<?> cls, String str, String str2, Boolean bool);
}
