package p000;

/* JADX INFO: renamed from: ۥۘؗؖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2181 {

    /* JADX INFO: renamed from: ۥؗ */
    public int f7208;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f7209;

    /* JADX INFO: renamed from: ۥۣ */
    public final Object f7210;

    /* JADX INFO: renamed from: ۦؑ */
    public final String f7211;

    public C2181(int i, int i2, Object obj, String str) {
        this.f7210 = obj;
        this.f7209 = i;
        this.f7208 = i2;
        this.f7211 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2181)) {
            return false;
        }
        C2181 c2181 = (C2181) obj;
        return AbstractC3831.m6874(this.f7210, c2181.f7210) && this.f7209 == c2181.f7209 && this.f7208 == c2181.f7208 && AbstractC3831.m6874(this.f7211, c2181.f7211);
    }

    public final int hashCode() {
        Object obj = this.f7210;
        return this.f7211.hashCode() + AbstractC2049.m3999(this.f7208, AbstractC2049.m3999(this.f7209, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.f7210);
        sb.append(", start=");
        sb.append(this.f7209);
        sb.append(", end=");
        sb.append(this.f7208);
        sb.append(", tag=");
        return AbstractC5078.m8678(sb, this.f7211, ')');
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C2331 m4236(int i) {
        int i2 = this.f7208;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (!(i != Integer.MIN_VALUE)) {
            AbstractC3767.m6643("Item.end should be set first");
        }
        return new C2331(this.f7209, i, this.f7210, this.f7211);
    }

    public /* synthetic */ C2181(InterfaceC1116 interfaceC1116, int i, int i2, int i3) {
        this(i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, interfaceC1116, "");
    }
}
