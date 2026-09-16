package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import p000.AbstractC2132;
import p000.AbstractC2164;
import p000.C0332;
import p000.C0373;
import p000.C1166;
import p000.C1298;
import p000.C1397;
import p000.C4380;
import p000.C5221;
import p000.InterfaceC0740;
import p000.InterfaceC2053;
import p000.InterfaceC2900;
import p000.InterfaceC3171;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5221> getComponents() {
        C4380 c4380M8848 = C5221.m8848(new C1166(InterfaceC0740.class, AbstractC2132.class));
        c4380M8848.m7683(new C0332(new C1166(InterfaceC0740.class, Executor.class), 1, 0));
        c4380M8848.f14438 = C1298.f4451;
        C5221 c5221M7682 = c4380M8848.m7682();
        C4380 c4380M8849 = C5221.m8848(new C1166(InterfaceC2053.class, AbstractC2132.class));
        c4380M8849.m7683(new C0332(new C1166(InterfaceC2053.class, Executor.class), 1, 0));
        c4380M8849.f14438 = C1397.f4787;
        C5221 c5221M7683 = c4380M8849.m7682();
        C4380 c4380M88410 = C5221.m8848(new C1166(InterfaceC3171.class, AbstractC2132.class));
        c4380M88410.m7683(new C0332(new C1166(InterfaceC3171.class, Executor.class), 1, 0));
        c4380M88410.f14438 = C0373.f1379;
        C5221 c5221M7684 = c4380M88410.m7682();
        C4380 c4380M88411 = C5221.m8848(new C1166(InterfaceC2900.class, AbstractC2132.class));
        c4380M88411.m7683(new C0332(new C1166(InterfaceC2900.class, Executor.class), 1, 0));
        c4380M88411.f14438 = C1298.f4422;
        return AbstractC2164.m4188(c5221M7682, c5221M7683, c5221M7684, c4380M88411.m7682());
    }
}
