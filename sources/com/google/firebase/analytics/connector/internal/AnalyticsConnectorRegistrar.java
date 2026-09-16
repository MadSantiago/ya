package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC0186;
import p000.AbstractC0487;
import p000.C0332;
import p000.C0354;
import p000.C0377;
import p000.C3286;
import p000.C4048;
import p000.C4380;
import p000.C4452;
import p000.C5221;
import p000.C5491;
import p000.InterfaceC4188;
import p000.InterfaceC4844;
import p000.InterfaceC5067;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC4188 lambda$getComponents$0(InterfaceC4844 interfaceC4844) {
        boolean z;
        C0377 c0377 = (C0377) interfaceC4844.mo5371(C0377.class);
        Context context = (Context) interfaceC4844.mo5371(Context.class);
        InterfaceC5067 interfaceC5067 = (InterfaceC5067) interfaceC4844.mo5371(InterfaceC5067.class);
        AbstractC0487.m1047(c0377);
        AbstractC0487.m1047(context);
        AbstractC0487.m1047(interfaceC5067);
        AbstractC0487.m1047(context.getApplicationContext());
        if (C0354.f1291 == null) {
            synchronized (C0354.class) {
                if (C0354.f1291 == null) {
                    Bundle bundle = new Bundle(1);
                    c0377.m825();
                    if ("[DEFAULT]".equals(c0377.f1408)) {
                        ((C4048) interfaceC5067).m7253();
                        c0377.m825();
                        C5491 c5491 = (C5491) c0377.f1414.get();
                        synchronized (c5491) {
                            z = c5491.f18101;
                        }
                        bundle.putBoolean("dataCollectionDefaultEnabled", z);
                    }
                    C0354.f1291 = new C0354(C3286.m6043(context, bundle).f11011);
                }
            }
        }
        return C0354.f1291;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5221> getComponents() {
        C4380 c4380M8847 = C5221.m8847(InterfaceC4188.class);
        c4380M8847.m7683(C0332.m763(C0377.class));
        c4380M8847.m7683(C0332.m763(Context.class));
        c4380M8847.m7683(C0332.m763(InterfaceC5067.class));
        c4380M8847.f14438 = C4452.f14673;
        c4380M8847.m7681();
        return Arrays.asList(c4380M8847.m7682(), AbstractC0186.m417("fire-analytics", "23.2.0"));
    }
}
