package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦُُۨؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5890 {

    /* JADX INFO: renamed from: ۥۗ */
    public final List f19426;

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean f19427;

    public C5890(List list, boolean z) {
        this.f19427 = z;
        this.f19426 = list;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C5890 m9722(C5890 c5890, boolean z, List list, int i) {
        if ((i & 1) != 0) {
            z = c5890.f19427;
        }
        if ((i & 2) != 0) {
            list = c5890.f19426;
        }
        c5890.getClass();
        return new C5890(list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5890)) {
            return false;
        }
        C5890 c5890 = (C5890) obj;
        return this.f19427 == c5890.f19427 && AbstractC3831.m6874(this.f19426, c5890.f19426);
    }

    public final int hashCode() {
        return this.f19426.hashCode() + (Boolean.hashCode(this.f19427) * 31);
    }

    public final String toString() {
        return "CoreAppStates(fabVisibility=" + this.f19427 + ", changedSettings=" + this.f19426 + ")";
    }
}
