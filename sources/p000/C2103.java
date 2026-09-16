package p000;

/* JADX INFO: renamed from: ۥۗؓؕٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2103 extends C0588 implements InterfaceC3595 {

    /* JADX INFO: renamed from: ۥٓ */
    public static final C2103 f6923 = new C2103(C1205.f4146, 0);

    @Override // p000.C0588, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC2266) {
            return super.containsKey((AbstractC2266) obj);
        }
        return false;
    }

    @Override // p000.C0588, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof InterfaceC3633) {
            return super.containsValue((InterfaceC3633) obj);
        }
        return false;
    }

    @Override // p000.C0588, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC2266) {
            return (InterfaceC3633) super.get((AbstractC2266) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC2266) ? obj2 : (InterfaceC3633) super.getOrDefault((AbstractC2266) obj, (InterfaceC3633) obj2);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C2103 m4079(AbstractC2266 abstractC2266, InterfaceC3633 interfaceC3633) {
        C0322 c0322M2545 = this.f2193.m2545(abstractC2266.hashCode(), 0, abstractC2266, interfaceC3633);
        return c0322M2545 == null ? this : new C2103((C1205) c0322M2545.f1178, this.f2192 + c0322M2545.f1179);
    }
}
