package com.google.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import p000.AbstractC0186;
import p000.C0230;
import p000.C0332;
import p000.C0377;
import p000.C0579;
import p000.C1166;
import p000.C4380;
import p000.C4843;
import p000.C5221;
import p000.C5322;
import p000.C5714;
import p000.EnumC1499;
import p000.InterfaceC0740;
import p000.InterfaceC2053;
import p000.InterfaceC2361;
import p000.InterfaceC3171;
import p000.InterfaceC4188;
import p000.InterfaceC5623;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: ۦؑ */
    public static final /* synthetic */ int f352 = 0;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1166 f355 = new C1166(InterfaceC0740.class, ExecutorService.class);

    /* JADX INFO: renamed from: ۥۗ */
    public final C1166 f354 = new C1166(InterfaceC3171.class, ExecutorService.class);

    /* JADX INFO: renamed from: ۥؗ */
    public final C1166 f353 = new C1166(InterfaceC2053.class, ExecutorService.class);

    static {
        Map map = C0230.f871;
        EnumC1499 enumC1499 = EnumC1499.f5085;
        if (map.containsKey(enumC1499)) {
            Log.d("FirebaseSessions", "Dependency " + enumC1499 + " already added.");
            return;
        }
        map.put(enumC1499, new C0579(new CountDownLatch(1)));
        Log.d("FirebaseSessions", "Dependency to " + enumC1499 + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C4380 c4380M8847 = C5221.m8847(C5714.class);
        c4380M8847.f14440 = "fire-cls";
        c4380M8847.m7683(C0332.m763(C0377.class));
        c4380M8847.m7683(C0332.m763(InterfaceC2361.class));
        c4380M8847.m7683(new C0332(this.f355, 1, 0));
        c4380M8847.m7683(new C0332(this.f354, 1, 0));
        c4380M8847.m7683(new C0332(this.f353, 1, 0));
        c4380M8847.m7683(new C0332(0, 2, C4843.class));
        c4380M8847.m7683(new C0332(0, 2, InterfaceC4188.class));
        c4380M8847.m7683(new C0332(0, 2, InterfaceC5623.class));
        c4380M8847.f14438 = new C5322(2, this);
        c4380M8847.m7681();
        return Arrays.asList(c4380M8847.m7682(), AbstractC0186.m417("fire-cls", "20.1.0"));
    }
}
