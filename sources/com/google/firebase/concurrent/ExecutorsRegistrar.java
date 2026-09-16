package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p000.AbstractC1631;
import p000.C0916;
import p000.C1166;
import p000.C4380;
import p000.C4668;
import p000.C5028;
import p000.C5221;
import p000.InterfaceC0740;
import p000.InterfaceC2053;
import p000.InterfaceC2900;
import p000.InterfaceC3171;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C0916 f350 = new C0916(new C4668(1));

    /* JADX INFO: renamed from: ۥۗ */
    public static final C0916 f349 = new C0916(new C4668(2));

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0916 f348 = new C0916(new C4668(3));

    /* JADX INFO: renamed from: ۦؑ */
    public static final C0916 f351 = new C0916(new C4668(4));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C1166 c1166 = new C1166(InterfaceC0740.class, ScheduledExecutorService.class);
        C1166[] c1166Arr = {new C1166(InterfaceC0740.class, ExecutorService.class), new C1166(InterfaceC0740.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(c1166);
        for (int i = 0; i < 2; i++) {
            AbstractC1631.m3435(c1166Arr[i], "Null interface");
        }
        Collections.addAll(hashSet, c1166Arr);
        C5221 c5221 = new C5221(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C5028(5), hashSet3);
        C1166 c1167 = new C1166(InterfaceC3171.class, ScheduledExecutorService.class);
        C1166[] c1166Arr2 = {new C1166(InterfaceC3171.class, ExecutorService.class), new C1166(InterfaceC3171.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(c1167);
        for (int i2 = 0; i2 < 2; i2++) {
            AbstractC1631.m3435(c1166Arr2[i2], "Null interface");
        }
        Collections.addAll(hashSet4, c1166Arr2);
        C5221 c5222 = new C5221(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new C5028(6), hashSet6);
        C1166 c1168 = new C1166(InterfaceC2053.class, ScheduledExecutorService.class);
        C1166[] c1166Arr3 = {new C1166(InterfaceC2053.class, ExecutorService.class), new C1166(InterfaceC2053.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(c1168);
        for (int i3 = 0; i3 < 2; i3++) {
            AbstractC1631.m3435(c1166Arr3[i3], "Null interface");
        }
        Collections.addAll(hashSet7, c1166Arr3);
        C5221 c5223 = new C5221(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new C5028(7), hashSet9);
        C4380 c4380M8848 = C5221.m8848(new C1166(InterfaceC2900.class, Executor.class));
        c4380M8848.f14438 = new C5028(8);
        return Arrays.asList(c5221, c5222, c5223, c4380M8848.m7682());
    }
}
