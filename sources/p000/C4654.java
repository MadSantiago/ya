package p000;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ۦٛٔۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4654 implements InterfaceC1648 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f15351;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f15352;

    public /* synthetic */ C4654(int i, Object obj) {
        this.f15352 = i;
        this.f15351 = obj;
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo1683(InterfaceC4507 interfaceC4507, EnumC1924 enumC1924) {
        int i = this.f15352;
        Object obj = this.f15351;
        switch (i) {
            case 0:
                InterfaceC3983 interfaceC3983 = (InterfaceC3983) obj;
                if (enumC1924 != EnumC1924.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC4507.mo110().mo2389(this);
                Bundle bundleM4415 = interfaceC3983.mo648().m4415("androidx.savedstate.Restarter");
                if (bundleM4415 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleM4415.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    C1078.m2276("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, C4654.class.getClassLoader()).asSubclass(InterfaceC2498.class);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            int i2 = 1;
                            declaredConstructor.setAccessible(true);
                            try {
                                ((C3818) ((InterfaceC2498) declaredConstructor.newInstance(null))).getClass();
                                if (!(interfaceC3983 instanceof InterfaceC4680)) {
                                    C5028.m8445(interfaceC3983, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                C3160 c3160Mo651 = ((InterfaceC4680) interfaceC3983).mo651();
                                C2346 c2346Mo648 = interfaceC3983.mo648();
                                c3160Mo651.getClass();
                                LinkedHashMap linkedHashMap = c3160Mo651.f10641;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    AbstractC0941 abstractC0941 = (AbstractC0941) linkedHashMap.get((String) it.next());
                                    if (abstractC0941 != null) {
                                        AbstractC1434 abstractC1434Mo110 = interfaceC3983.mo110();
                                        C2178 c2178 = (C2178) abstractC0941.m1914("androidx.lifecycle.savedstate.vm.tag");
                                        if (c2178 != null && !c2178.f7202) {
                                            c2178.m4235(c2346Mo648, abstractC1434Mo110);
                                            EnumC0458 enumC0458Mo2387 = abstractC1434Mo110.mo2387();
                                            if (enumC0458Mo2387 == EnumC0458.f1656 || enumC0458Mo2387.m976(EnumC0458.f1654)) {
                                                c2346Mo648.m4404();
                                            } else {
                                                abstractC1434Mo110.mo2388(new C4389(i2, abstractC1434Mo110, c2346Mo648));
                                            }
                                        }
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    c2346Mo648.m4404();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(AbstractC3761.m6628("Failed to instantiate ", str), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(AbstractC3761.m6629("Class ", str, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                AbstractActivityC1500 abstractActivityC1500 = (AbstractActivityC1500) obj;
                if (abstractActivityC1500.f5089 == null) {
                    C4220 c4220 = (C4220) abstractActivityC1500.getLastNonConfigurationInstance();
                    if (c4220 != null) {
                        abstractActivityC1500.f5089 = c4220.f14000;
                    }
                    if (abstractActivityC1500.f5089 == null) {
                        abstractActivityC1500.f5089 = new C3160();
                    }
                }
                abstractActivityC1500.f5665.mo2389(this);
                return;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                new HashMap();
                InterfaceC5268[] interfaceC5268Arr = (InterfaceC5268[]) obj;
                if (interfaceC5268Arr.length > 0) {
                    InterfaceC5268 interfaceC5268 = interfaceC5268Arr[0];
                    throw null;
                }
                if (interfaceC5268Arr.length <= 0) {
                    return;
                }
                InterfaceC5268 interfaceC5269 = interfaceC5268Arr[0];
                throw null;
            default:
                if (enumC1924 != EnumC1924.ON_CREATE) {
                    C5028.m8445(enumC1924, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    interfaceC4507.mo110().mo2389(this);
                    ((C2869) obj).m5437();
                    return;
                }
        }
    }
}
