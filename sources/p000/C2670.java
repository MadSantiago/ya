package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥٕۤؓۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC4061
@InterfaceC1172
public final class C2670 {
    public static final C1794 Companion = new C1794();

    /* JADX INFO: renamed from: ۥُ */
    public static final InterfaceC5130[] f8845 = {null, null, AbstractC3933.m7095(2, new C0871(29)), null};

    /* JADX INFO: renamed from: ۥؗ */
    public final List f8846;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f8847;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f8848;

    /* JADX INFO: renamed from: ۦؑ */
    public final String f8849;

    public /* synthetic */ C2670(int i, String str, String str2, List list, String str3) {
        if (15 != (i & 15)) {
            AbstractC5568.m9392(i, 15, C5553.f18335.mo193());
            throw null;
        }
        this.f8848 = str;
        this.f8847 = str2;
        this.f8846 = list;
        this.f8849 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2670)) {
            return false;
        }
        C2670 c2670 = (C2670) obj;
        return AbstractC3831.m6874(this.f8848, c2670.f8848) && AbstractC3831.m6874(this.f8847, c2670.f8847) && AbstractC3831.m6874(this.f8846, c2670.f8846) && AbstractC3831.m6874(this.f8849, c2670.f8849);
    }

    public final int hashCode() {
        return this.f8849.hashCode() + ((this.f8846.hashCode() + AbstractC5078.m8674(this.f8848.hashCode() * 31, 31, this.f8847)) * 31);
    }

    public final String toString() {
        return "Release(tagName=" + this.f8848 + ", name=" + this.f8847 + ", assets=" + this.f8846 + ", body=" + this.f8849 + ")";
    }
}
