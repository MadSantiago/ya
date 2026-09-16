package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p000.AbstractC0186;
import p000.C0332;
import p000.C0377;
import p000.C1166;
import p000.C1397;
import p000.C1639;
import p000.C2588;
import p000.C4380;
import p000.C5028;
import p000.C5221;
import p000.ExecutorC3331;
import p000.InterfaceC0740;
import p000.InterfaceC0985;
import p000.InterfaceC2361;
import p000.InterfaceC3171;
import p000.InterfaceC4844;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC2361 lambda$getComponents$0(InterfaceC4844 interfaceC4844) {
        return new C2588((C0377) interfaceC4844.mo5371(C0377.class), interfaceC4844.mo5372(InterfaceC0985.class), (ExecutorService) interfaceC4844.mo5376(new C1166(InterfaceC0740.class, ExecutorService.class)), new ExecutorC3331((Executor) interfaceC4844.mo5376(new C1166(InterfaceC3171.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5221> getComponents() {
        C4380 c4380M8847 = C5221.m8847(InterfaceC2361.class);
        c4380M8847.f14440 = LIBRARY_NAME;
        c4380M8847.m7683(C0332.m763(C0377.class));
        int i = 0;
        c4380M8847.m7683(new C0332(0, 1, InterfaceC0985.class));
        c4380M8847.m7683(new C0332(new C1166(InterfaceC0740.class, ExecutorService.class), 1, 0));
        c4380M8847.m7683(new C0332(new C1166(InterfaceC3171.class, Executor.class), 1, 0));
        c4380M8847.f14438 = new C5028(16);
        C5221 c5221M7682 = c4380M8847.m7682();
        C1397 c1397 = new C1397(i);
        C4380 c4380M8848 = C5221.m8847(C1397.class);
        c4380M8848.f14437 = 1;
        c4380M8848.f14438 = new C1639(i, c1397);
        return Arrays.asList(c5221M7682, c4380M8848.m7682(), AbstractC0186.m417(LIBRARY_NAME, "19.1.2"));
    }
}
