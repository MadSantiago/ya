package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ۥؙؔۗ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0726 implements InterfaceC2150 {

    /* JADX INFO: renamed from: ۦۨ */
    public final boolean f2652;

    public C0726(Boolean bool) {
        this.f2652 = bool == null ? false : bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0726) && this.f2652 == ((C0726) obj).f2652;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f2652).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f2652);
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥُ */
    public final Iterator mo1606() {
        return null;
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥّ */
    public final String mo1607() {
        return Boolean.toString(this.f2652);
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥۜ */
    public final InterfaceC2150 mo1608(String str, C1489 c1489, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.f2652;
        if (zEquals) {
            return new C2485(Boolean.toString(z));
        }
        throw new IllegalArgumentException(Boolean.toString(z) + "." + str + " is not a function.");
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦؑ */
    public final Boolean mo1609() {
        return Boolean.valueOf(this.f2652);
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦٛ */
    public final Double mo1610() {
        return Double.valueOf(true != this.f2652 ? 0.0d : 1.0d);
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦۚ */
    public final InterfaceC2150 mo1611() {
        return new C0726(Boolean.valueOf(this.f2652));
    }
}
