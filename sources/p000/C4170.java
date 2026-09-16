package p000;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ۦّٔؓۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4170 extends AbstractC1434 {

    /* JADX INFO: renamed from: ۥّ */
    public final boolean f13873;

    /* JADX INFO: renamed from: ۥۜ */
    public EnumC0458 f13874;

    /* JADX INFO: renamed from: ۦؚ */
    public boolean f13875;

    /* JADX INFO: renamed from: ۦٌ */
    public final ArrayList f13876;

    /* JADX INFO: renamed from: ۦِ */
    public int f13877;

    /* JADX INFO: renamed from: ۦٛ */
    public final WeakReference f13878;

    /* JADX INFO: renamed from: ۦۗ */
    public boolean f13879;

    /* JADX INFO: renamed from: ۦۙ */
    public C5409 f13880;

    /* JADX INFO: renamed from: ۦۚ */
    public final C4994 f13881;

    public C4170(InterfaceC4507 interfaceC4507, boolean z) {
        super(16);
        this.f13873 = z;
        this.f13880 = new C5409();
        EnumC0458 enumC0458 = EnumC0458.f1656;
        this.f13874 = enumC0458;
        this.f13876 = new ArrayList();
        this.f13878 = new WeakReference(interfaceC4507);
        this.f13881 = AbstractC1605.m3349(enumC0458);
    }

    @Override // p000.AbstractC1434
    /* JADX INFO: renamed from: ۥؖ */
    public final EnumC0458 mo2387() {
        return this.f13874;
    }

    @Override // p000.AbstractC1434
    /* JADX INFO: renamed from: ۥُ */
    public final void mo2388(InterfaceC0335 interfaceC0335) {
        InterfaceC1648 c4389;
        Object obj;
        InterfaceC4507 interfaceC4507;
        EnumC1924 enumC1924;
        m7368("addObserver");
        EnumC0458 enumC0458 = this.f13874;
        EnumC0458 enumC0459 = EnumC0458.f1657;
        if (enumC0458 != enumC0459) {
            enumC0459 = EnumC0458.f1656;
        }
        C5788 c5788 = new C5788();
        HashMap map = AbstractC1555.f5243;
        boolean z = interfaceC0335 instanceof InterfaceC1648;
        boolean z2 = interfaceC0335 instanceof InterfaceC3240;
        int i = 2;
        Object obj2 = null;
        int i2 = 0;
        if (z && z2) {
            c4389 = new C4389(i2, (InterfaceC3240) interfaceC0335, (InterfaceC1648) interfaceC0335);
        } else if (z2) {
            c4389 = new C4389(i2, (InterfaceC3240) interfaceC0335, obj2);
        } else if (z) {
            c4389 = (InterfaceC1648) interfaceC0335;
        } else {
            Class<?> cls = interfaceC0335.getClass();
            if (AbstractC1555.m3310(cls) == 2) {
                List list = (List) AbstractC1555.f5242.get(cls);
                if (list.size() == 1) {
                    AbstractC1555.m3311((Constructor) list.get(0), interfaceC0335);
                    c4389 = new C0828();
                } else {
                    int size = list.size();
                    InterfaceC5268[] interfaceC5268Arr = new InterfaceC5268[size];
                    for (int i3 = 0; i3 < size; i3++) {
                        AbstractC1555.m3311((Constructor) list.get(i3), interfaceC0335);
                        interfaceC5268Arr[i3] = null;
                    }
                    c4389 = new C4654(i, interfaceC5268Arr);
                }
            } else {
                c4389 = new C4389(interfaceC0335);
            }
        }
        c5788.f19068 = c4389;
        c5788.f19069 = enumC0459;
        C5409 c5409 = this.f13880;
        C2985 c2985Mo7717 = c5409.mo7717(interfaceC0335);
        if (c2985Mo7717 != null) {
            obj = c2985Mo7717.f10039;
        } else {
            HashMap map2 = c5409.f17862;
            C2985 c2985 = new C2985(interfaceC0335, c5788);
            c5409.f14566++;
            C2985 c2986 = c5409.f14567;
            if (c2986 == null) {
                c5409.f14568 = c2985;
                c5409.f14567 = c2985;
            } else {
                c2986.f10037 = c2985;
                c2985.f10038 = c2986;
                c5409.f14567 = c2985;
            }
            map2.put(interfaceC0335, c2985);
            obj = null;
        }
        if (((C5788) obj) == null && (interfaceC4507 = (InterfaceC4507) this.f13878.get()) != null) {
            i2 = (this.f13877 != 0 || this.f13879) ? 1 : 0;
            EnumC0458 enumC0458M7365 = m7365(interfaceC0335);
            this.f13877++;
            while (c5788.f19069.compareTo(enumC0458M7365) < 0 && this.f13880.f17862.containsKey(interfaceC0335)) {
                EnumC0458 enumC04510 = c5788.f19069;
                ArrayList arrayList = this.f13876;
                arrayList.add(enumC04510);
                C1926 c1926 = EnumC1924.Companion;
                EnumC0458 enumC04511 = c5788.f19069;
                c1926.getClass();
                int iOrdinal = enumC04511.ordinal();
                if (iOrdinal == 1) {
                    enumC1924 = EnumC1924.ON_CREATE;
                } else if (iOrdinal != 2) {
                    enumC1924 = iOrdinal != 3 ? null : EnumC1924.ON_RESUME;
                } else {
                    enumC1924 = EnumC1924.ON_START;
                }
                if (enumC1924 == null) {
                    C5028.m8453(c5788.f19069, "no event up from ");
                    return;
                } else {
                    c5788.m9602(interfaceC4507, enumC1924);
                    arrayList.remove(arrayList.size() - 1);
                    enumC0458M7365 = m7365(interfaceC0335);
                }
            }
            if (i2 == 0) {
                m7367();
            }
            this.f13877--;
        }
    }

    /* JADX INFO: renamed from: ۥٛ */
    public final EnumC0458 m7365(InterfaceC0335 interfaceC0335) {
        HashMap map = this.f13880.f17862;
        C2985 c2985 = map.containsKey(interfaceC0335) ? ((C2985) map.get(interfaceC0335)).f10038 : null;
        EnumC0458 enumC0458 = c2985 != null ? ((C5788) c2985.f10039).f19069 : null;
        ArrayList arrayList = this.f13876;
        EnumC0458 enumC0459 = arrayList.isEmpty() ? null : (EnumC0458) arrayList.get(arrayList.size() - 1);
        EnumC0458 enumC04510 = this.f13874;
        if (enumC0458 == null || enumC0458.compareTo(enumC04510) >= 0) {
            enumC0458 = enumC04510;
        }
        return (enumC0459 == null || enumC0459.compareTo(enumC0458) >= 0) ? enumC0458 : enumC0459;
    }

    /* JADX INFO: renamed from: ۥٝ */
    public final void m7366(EnumC0458 enumC0458) {
        if (this.f13874 == enumC0458) {
            return;
        }
        InterfaceC4507 interfaceC4507 = (InterfaceC4507) this.f13878.get();
        EnumC0458 enumC0459 = this.f13874;
        EnumC0458 enumC04510 = EnumC0458.f1656;
        EnumC0458 enumC04511 = EnumC0458.f1657;
        if (enumC0459 == enumC04510 && enumC0458 == enumC04511) {
            throw new IllegalStateException(("State must be at least '" + EnumC0458.f1653 + "' to be moved to '" + enumC0458 + "' in component " + interfaceC4507).toString());
        }
        if (enumC0459 == enumC04511 && enumC0459 != enumC0458) {
            throw new IllegalStateException(("State is '" + enumC04511 + "' and cannot be moved to `" + enumC0458 + "` in component " + interfaceC4507).toString());
        }
        this.f13874 = enumC0458;
        if (this.f13879 || this.f13877 != 0) {
            this.f13875 = true;
            return;
        }
        this.f13879 = true;
        m7367();
        this.f13879 = false;
        if (this.f13874 == enumC04511) {
            this.f13880 = new C5409();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m7367() {
        EnumC0458 enumC0458;
        EnumC0458 enumC0459;
        EnumC1924 enumC1924;
        EnumC1924 enumC1925;
        InterfaceC4507 interfaceC4507 = (InterfaceC4507) this.f13878.get();
        if (interfaceC4507 == null) {
            C1078.m2276("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            C5409 c5409 = this.f13880;
            if (c5409.f14566 == 0 || ((enumC0458 = ((C5788) c5409.f14568.f10039).f19069) == (enumC0459 = ((C5788) c5409.f14567.f10039).f19069) && this.f13874 == enumC0459)) {
                break;
            }
            this.f13875 = false;
            int iCompareTo = this.f13874.compareTo(enumC0458);
            ArrayList arrayList = this.f13876;
            if (iCompareTo < 0) {
                C5409 c54010 = this.f13880;
                C0840 c0840 = new C0840(c54010.f14567, c54010.f14568, 1);
                c54010.f14565.put(c0840, Boolean.FALSE);
                while (c0840.hasNext() && !this.f13875) {
                    Map.Entry entry = (Map.Entry) c0840.next();
                    InterfaceC0335 interfaceC0335 = (InterfaceC0335) entry.getKey();
                    C5788 c5788 = (C5788) entry.getValue();
                    while (c5788.f19069.compareTo(this.f13874) > 0 && !this.f13875 && this.f13880.f17862.containsKey(interfaceC0335)) {
                        C1926 c1926 = EnumC1924.Companion;
                        EnumC0458 enumC04510 = c5788.f19069;
                        c1926.getClass();
                        int iOrdinal = enumC04510.ordinal();
                        if (iOrdinal == 2) {
                            enumC1925 = EnumC1924.ON_DESTROY;
                        } else if (iOrdinal != 3) {
                            enumC1925 = iOrdinal != 4 ? null : EnumC1924.ON_PAUSE;
                        } else {
                            enumC1925 = EnumC1924.ON_STOP;
                        }
                        if (enumC1925 == null) {
                            C5028.m8453(c5788.f19069, "no event down from ");
                            return;
                        } else {
                            arrayList.add(enumC1925.m3773());
                            c5788.m9602(interfaceC4507, enumC1925);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            }
            C2985 c2985 = this.f13880.f14567;
            if (!this.f13875 && c2985 != null && this.f13874.compareTo(((C5788) c2985.f10039).f19069) > 0) {
                C5409 c54011 = this.f13880;
                c54011.getClass();
                C4305 c4305 = new C4305(c54011);
                c54011.f14565.put(c4305, Boolean.FALSE);
                while (c4305.hasNext() && !this.f13875) {
                    Map.Entry entry2 = (Map.Entry) c4305.next();
                    InterfaceC0335 interfaceC0336 = (InterfaceC0335) entry2.getKey();
                    C5788 c5789 = (C5788) entry2.getValue();
                    while (c5789.f19069.compareTo(this.f13874) < 0 && !this.f13875 && this.f13880.f17862.containsKey(interfaceC0336)) {
                        arrayList.add(c5789.f19069);
                        C1926 c1927 = EnumC1924.Companion;
                        EnumC0458 enumC04511 = c5789.f19069;
                        c1927.getClass();
                        int iOrdinal2 = enumC04511.ordinal();
                        if (iOrdinal2 == 1) {
                            enumC1924 = EnumC1924.ON_CREATE;
                        } else if (iOrdinal2 != 2) {
                            enumC1924 = iOrdinal2 != 3 ? null : EnumC1924.ON_RESUME;
                        } else {
                            enumC1924 = EnumC1924.ON_START;
                        }
                        if (enumC1924 == null) {
                            C5028.m8453(c5789.f19069, "no event up from ");
                            return;
                        } else {
                            c5789.m9602(interfaceC4507, enumC1924);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            }
        }
        this.f13875 = false;
        this.f13881.m8387(this.f13874);
    }

    /* JADX INFO: renamed from: ۥۤ */
    public final void m7368(String str) {
        if (this.f13873) {
            C1774.m3564().getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            C1078.m2278(AbstractC3761.m6629("Method ", str, " must be called on the main thread"));
        }
    }

    /* JADX INFO: renamed from: ۦؒ */
    public final void m7369(EnumC1924 enumC1924) {
        m7368("handleLifecycleEvent");
        m7366(enumC1924.m3773());
    }

    @Override // p000.AbstractC1434
    /* JADX INFO: renamed from: ۦُ */
    public final void mo2389(InterfaceC0335 interfaceC0335) {
        m7368("removeObserver");
        this.f13880.mo7718(interfaceC0335);
    }
}
