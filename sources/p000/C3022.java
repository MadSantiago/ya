package p000;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ۦؚؑؒٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3022 implements InterfaceC0217 {

    /* JADX INFO: renamed from: ۥَ */
    public final C2346 f10179;

    /* JADX INFO: renamed from: ۥْ */
    public final Bundle f10180;

    /* JADX INFO: renamed from: ۥٓ */
    public final AbstractC1434 f10181;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C4800 f10182;

    /* JADX INFO: renamed from: ۦۨ */
    public final Application f10183;

    public C3022(Application application, InterfaceC3983 interfaceC3983, Bundle bundle) {
        C4800 c4800;
        this.f10179 = interfaceC3983.mo648();
        this.f10181 = interfaceC3983.mo110();
        this.f10180 = bundle;
        this.f10183 = application;
        if (application != null) {
            c4800 = C4800.f15836;
            if (c4800 == null) {
                c4800 = new C4800(application);
                C4800.f15836 = c4800;
            }
        } else {
            c4800 = new C4800(null);
        }
        this.f10182 = c4800;
    }

    @Override // p000.InterfaceC0217
    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC0941 mo474(Class cls, C4397 c4397) {
        C4452 c4452 = AbstractC2164.f7142;
        LinkedHashMap linkedHashMap = c4397.f18983;
        String str = (String) linkedHashMap.get(c4452);
        if (str == null) {
            C1078.m2276("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(AbstractC2765.f9171) == null || linkedHashMap.get(AbstractC2765.f9173) == null) {
            if (this.f10181 != null) {
                return m5615(cls, str);
            }
            C1078.m2276("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(C4800.f15837);
        boolean zIsAssignableFrom = AbstractC2217.class.isAssignableFrom(cls);
        Constructor constructorM7721 = (!zIsAssignableFrom || application == null) ? AbstractC4425.m7721(cls, AbstractC4425.f14598) : AbstractC4425.m7721(cls, AbstractC4425.f14599);
        if (constructorM7721 == null) {
            return this.f10182.mo474(cls, c4397);
        }
        return (!zIsAssignableFrom || application == null) ? AbstractC4425.m7720(cls, constructorM7721, AbstractC2765.m5136(c4397)) : AbstractC4425.m7720(cls, constructorM7721, application, AbstractC2765.m5136(c4397));
    }

    @Override // p000.InterfaceC0217
    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC0941 mo475(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m5615(cls, canonicalName);
        }
        C1078.m2272("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // p000.InterfaceC0217
    /* JADX INFO: renamed from: ۥۜ */
    public final AbstractC0941 mo476(C3131 c3131, C4397 c4397) {
        return mo474(c3131.f10543, c4397);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC0941 m5615(Class cls, String str) {
        AbstractC1434 abstractC1434 = this.f10181;
        if (abstractC1434 == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC2217.class.isAssignableFrom(cls);
        Application application = this.f10183;
        Constructor constructorM7721 = (!zIsAssignableFrom || application == null) ? AbstractC4425.m7721(cls, AbstractC4425.f14598) : AbstractC4425.m7721(cls, AbstractC4425.f14599);
        if (constructorM7721 == null) {
            if (application != null) {
                return this.f10182.mo475(cls);
            }
            C4369 c4369 = C4369.f14401;
            if (c4369 == null) {
                c4369 = new C4369(4);
                C4369.f14401 = c4369;
            }
            return c4369.mo475(cls);
        }
        Bundle bundle = this.f10180;
        C2346 c2346 = this.f10179;
        C1106 c1106M7895 = AbstractC4554.m7895(c2346.m4415(str), bundle);
        C2178 c2178 = new C2178(str, c1106M7895);
        c2178.m4235(c2346, abstractC1434);
        EnumC0458 enumC0458Mo2387 = abstractC1434.mo2387();
        if (enumC0458Mo2387 == EnumC0458.f1656 || enumC0458Mo2387.m976(EnumC0458.f1654)) {
            c2346.m4404();
        } else {
            abstractC1434.mo2388(new C4389(1, abstractC1434, c2346));
        }
        AbstractC0941 abstractC0941M7720 = (!zIsAssignableFrom || application == null) ? AbstractC4425.m7720(cls, constructorM7721, c1106M7895) : AbstractC4425.m7720(cls, constructorM7721, application, c1106M7895);
        abstractC0941M7720.m1916("androidx.lifecycle.savedstate.vm.tag", c2178);
        return abstractC0941M7720;
    }
}
