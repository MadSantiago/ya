package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p000.AbstractC0186;
import p000.AbstractC2132;
import p000.AbstractC2164;
import p000.AbstractC2552;
import p000.C0332;
import p000.C0377;
import p000.C0428;
import p000.C1039;
import p000.C1166;
import p000.C1414;
import p000.C1489;
import p000.C1764;
import p000.C1830;
import p000.C2411;
import p000.C2711;
import p000.C2808;
import p000.C3121;
import p000.C3261;
import p000.C4111;
import p000.C4380;
import p000.C4773;
import p000.C5028;
import p000.C5221;
import p000.C5358;
import p000.C5460;
import p000.InterfaceC0581;
import p000.InterfaceC0740;
import p000.InterfaceC1290;
import p000.InterfaceC2090;
import p000.InterfaceC2361;
import p000.InterfaceC3171;
import p000.InterfaceC3534;
import p000.InterfaceC4844;
import p000.InterfaceC5641;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final C4111 Companion = new C4111();
    private static final C1166 appContext = C1166.m2484(Context.class);
    private static final C1166 firebaseApp = C1166.m2484(C0377.class);
    private static final C1166 firebaseInstallationsApi = C1166.m2484(InterfaceC2361.class);
    private static final C1166 backgroundDispatcher = new C1166(InterfaceC0740.class, AbstractC2132.class);
    private static final C1166 blockingDispatcher = new C1166(InterfaceC3171.class, AbstractC2132.class);
    private static final C1166 transportFactory = C1166.m2484(InterfaceC0581.class);
    private static final C1166 firebaseSessionsComponent = C1166.m2484(InterfaceC1290.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3261 getComponents$lambda$0(InterfaceC4844 interfaceC4844) {
        return (C3261) ((C1830) ((InterfaceC1290) interfaceC4844.mo5376(firebaseSessionsComponent))).f6079.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1290 getComponents$lambda$1(InterfaceC4844 interfaceC4844) {
        Context context = (Context) interfaceC4844.mo5376(appContext);
        InterfaceC3534 interfaceC3534 = (InterfaceC3534) interfaceC4844.mo5376(backgroundDispatcher);
        InterfaceC3534 interfaceC3535 = (InterfaceC3534) interfaceC4844.mo5376(blockingDispatcher);
        C0377 c0377 = (C0377) interfaceC4844.mo5376(firebaseApp);
        InterfaceC2361 interfaceC2361 = (InterfaceC2361) interfaceC4844.mo5376(firebaseInstallationsApi);
        InterfaceC2090 interfaceC2090Mo5367 = interfaceC4844.mo5367(transportFactory);
        C1830 c1830 = new C1830();
        c1830.f6070 = C3121.m5735(c0377);
        C3121 c3121M5735 = C3121.m5735(context);
        c1830.f6068 = c3121M5735;
        c1830.f6065 = C5358.m8950(new C1764(c3121M5735, 2));
        c1830.f6071 = C5358.m8950(AbstractC2552.f8515);
        c1830.f6066 = C3121.m5735(interfaceC2361);
        int i = 1;
        c1830.f6067 = C5358.m8950(new C1764(c1830.f6070, i));
        C3121 c3121M5736 = C3121.m5735(interfaceC3535);
        c1830.f6077 = c3121M5736;
        c1830.f6069 = C5358.m8950(new C0428(c1830.f6067, c3121M5736));
        c1830.f6075 = C3121.m5735(interfaceC3534);
        int i2 = 0;
        c1830.f6074 = C5358.m8950(new C2411(c1830.f6065, C5358.m8950(new C1414(c1830.f6071, c1830.f6066, c1830.f6067, c1830.f6069, C5358.m8950(new C5460(c1830.f6075, c1830.f6071, C5358.m8950(new C0428(c1830.f6068, c1830.f6077, i2)), i)), 6)), i));
        InterfaceC5641 interfaceC5641M8950 = C5358.m8950(C4773.f15729);
        c1830.f6076 = interfaceC5641M8950;
        c1830.f6072 = C5358.m8950(new C2411(c1830.f6071, interfaceC5641M8950, i2));
        c1830.f6073 = C5358.m8950(new C1414(c1830.f6070, c1830.f6066, c1830.f6074, C5358.m8950(new C1764(C3121.m5735(interfaceC2090Mo5367), i2)), c1830.f6075, 11));
        c1830.f6078 = C5358.m8950(new C2808(c1830.f6068, c1830.f6077, C5358.m8950(new C3121(18, c1830.f6072)), 11));
        InterfaceC5641 interfaceC5641M8951 = C5358.m8950(new C2711(c1830.f6074, c1830.f6072, c1830.f6073, c1830.f6071, c1830.f6078, C5358.m8950(new C0428(c1830.f6068, c1830.f6076, i)), c1830.f6075));
        c1830.f6080 = interfaceC5641M8951;
        c1830.f6079 = C5358.m8950(new C1489(c1830.f6070, c1830.f6074, c1830.f6075, C5358.m8950(new C1039(8, interfaceC5641M8951)), 7));
        return c1830;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5221> getComponents() {
        C4380 c4380M8847 = C5221.m8847(C3261.class);
        c4380M8847.f14440 = LIBRARY_NAME;
        c4380M8847.m7683(C0332.m764(firebaseSessionsComponent));
        c4380M8847.f14438 = new C5028(18);
        c4380M8847.m7681();
        C5221 c5221M7682 = c4380M8847.m7682();
        C4380 c4380M8848 = C5221.m8847(InterfaceC1290.class);
        c4380M8848.f14440 = "fire-sessions-component";
        c4380M8848.m7683(C0332.m764(appContext));
        c4380M8848.m7683(C0332.m764(backgroundDispatcher));
        c4380M8848.m7683(C0332.m764(blockingDispatcher));
        c4380M8848.m7683(C0332.m764(firebaseApp));
        c4380M8848.m7683(C0332.m764(firebaseInstallationsApi));
        c4380M8848.m7683(new C0332(transportFactory, 1, 1));
        c4380M8848.f14438 = new C5028(19);
        return AbstractC2164.m4188(c5221M7682, c4380M8848.m7682(), AbstractC0186.m417(LIBRARY_NAME, "3.0.7"));
    }
}
