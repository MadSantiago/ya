package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p000.AbstractC0186;
import p000.C0161;
import p000.C0332;
import p000.C0377;
import p000.C1078;
import p000.C1166;
import p000.C1397;
import p000.C2239;
import p000.C2461;
import p000.C4380;
import p000.C4550;
import p000.C5028;
import p000.C5221;
import p000.C5322;
import p000.InterfaceC0740;
import p000.InterfaceC0985;
import p000.InterfaceC3515;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: renamed from: ۥۣ */
    public static String m136(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        C4380 c4380M8847 = C5221.m8847(C2239.class);
        c4380M8847.m7683(new C0332(2, 0, C4550.class));
        c4380M8847.f14438 = new C1078(26);
        arrayList.add(c4380M8847.m7682());
        C1166 c1166 = new C1166(InterfaceC0740.class, Executor.class);
        C4380 c4380 = new C4380(C0161.class, InterfaceC0985.class, InterfaceC3515.class);
        c4380.m7683(C0332.m763(Context.class));
        c4380.m7683(C0332.m763(C0377.class));
        c4380.m7683(new C0332(2, 0, C1397.class));
        c4380.m7683(new C0332(1, 1, C2239.class));
        c4380.m7683(new C0332(c1166, 1, 0));
        c4380.f14438 = new C5322(5, c1166);
        arrayList.add(c4380.m7682());
        arrayList.add(AbstractC0186.m417("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(AbstractC0186.m417("fire-core", "22.1.0"));
        arrayList.add(AbstractC0186.m417("device-name", m136(Build.PRODUCT)));
        arrayList.add(AbstractC0186.m417("device-model", m136(Build.DEVICE)));
        arrayList.add(AbstractC0186.m417("device-brand", m136(Build.BRAND)));
        arrayList.add(AbstractC0186.m421("android-target-sdk", new C5028(11)));
        arrayList.add(AbstractC0186.m421("android-min-sdk", new C5028(12)));
        arrayList.add(AbstractC0186.m421("android-platform", new C5028(13)));
        arrayList.add(AbstractC0186.m421("android-installer", new C5028(14)));
        try {
            C2461.f8217.getClass();
            str = "2.4.10";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(AbstractC0186.m417("kotlin", str));
        }
        return arrayList;
    }
}
