package p000;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: ۥؙؗؒۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0748 {

    /* JADX INFO: renamed from: ۥؗ */
    public List f2723;

    /* JADX INFO: renamed from: ۥۗ */
    public String f2724;

    /* JADX INFO: renamed from: ۥۣ */
    public String f2725;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0748)) {
            return false;
        }
        C0748 c0748 = (C0748) obj;
        return Objects.equals(this.f2725, c0748.f2725) && Objects.equals(this.f2724, c0748.f2724) && Objects.equals(this.f2723, c0748.f2723);
    }

    public final int hashCode() {
        return Objects.hash(this.f2725, this.f2724, this.f2723);
    }
}
