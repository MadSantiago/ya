package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC0186;
import p000.C0178;
import p000.C0332;
import p000.C1166;
import p000.C3518;
import p000.C4046;
import p000.C4380;
import p000.C5221;
import p000.InterfaceC0581;
import p000.InterfaceC4844;
import p000.InterfaceC4948;
import p000.InterfaceC5075;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC0581 lambda$getComponents$0(InterfaceC4844 interfaceC4844) {
        C4046.m7244((Context) interfaceC4844.mo5371(Context.class));
        return C4046.m7245().m7246(C3518.f11650);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC0581 lambda$getComponents$1(InterfaceC4844 interfaceC4844) {
        C4046.m7244((Context) interfaceC4844.mo5371(Context.class));
        return C4046.m7245().m7246(C3518.f11650);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC0581 lambda$getComponents$2(InterfaceC4844 interfaceC4844) {
        C4046.m7244((Context) interfaceC4844.mo5371(Context.class));
        return C4046.m7245().m7246(C3518.f11649);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5221> getComponents() {
        C4380 c4380M8847 = C5221.m8847(InterfaceC0581.class);
        c4380M8847.f14440 = LIBRARY_NAME;
        c4380M8847.m7683(C0332.m763(Context.class));
        c4380M8847.f14438 = new C0178(24);
        C5221 c5221M7682 = c4380M8847.m7682();
        C4380 c4380M8848 = C5221.m8848(new C1166(InterfaceC5075.class, InterfaceC0581.class));
        c4380M8848.m7683(C0332.m763(Context.class));
        c4380M8848.f14438 = new C0178(25);
        C5221 c5221M7683 = c4380M8848.m7682();
        C4380 c4380M8849 = C5221.m8848(new C1166(InterfaceC4948.class, InterfaceC0581.class));
        c4380M8849.m7683(C0332.m763(Context.class));
        c4380M8849.f14438 = new C0178(26);
        return Arrays.asList(c5221M7682, c5221M7683, c4380M8849.m7682(), AbstractC0186.m417(LIBRARY_NAME, "19.0.0"));
    }
}
