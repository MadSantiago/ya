package p000;

/* JADX INFO: renamed from: ۥۛؕۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2331 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f7717;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f7718;

    /* JADX INFO: renamed from: ۥۣ */
    public final Object f7719;

    /* JADX INFO: renamed from: ۦؑ */
    public final String f7720;

    public C2331(int i, int i2, Object obj, String str) {
        this.f7719 = obj;
        this.f7718 = i;
        this.f7717 = i2;
        this.f7720 = str;
        if (i <= i2) {
            return;
        }
        AbstractC3767.m6644("Reversed range is not supported");
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C2331 m4373(C2331 c2331, InterfaceC1116 interfaceC1116, int i, int i2) {
        Object obj = interfaceC1116;
        if ((i2 & 1) != 0) {
            obj = c2331.f7719;
        }
        int i3 = c2331.f7718;
        if ((i2 & 4) != 0) {
            i = c2331.f7717;
        }
        return new C2331(i3, i, obj, c2331.f7720);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2331)) {
            return false;
        }
        C2331 c2331 = (C2331) obj;
        return AbstractC3831.m6874(this.f7719, c2331.f7719) && this.f7718 == c2331.f7718 && this.f7717 == c2331.f7717 && AbstractC3831.m6874(this.f7720, c2331.f7720);
    }

    public final int hashCode() {
        Object obj = this.f7719;
        return this.f7720.hashCode() + AbstractC2049.m3999(this.f7717, AbstractC2049.m3999(this.f7718, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.f7719);
        sb.append(", start=");
        sb.append(this.f7718);
        sb.append(", end=");
        sb.append(this.f7717);
        sb.append(", tag=");
        return AbstractC5078.m8678(sb, this.f7720, ')');
    }

    public C2331(int i, int i2, Object obj) {
        this(i, i2, obj, "");
    }
}
