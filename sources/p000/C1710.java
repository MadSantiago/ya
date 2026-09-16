package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ۥًٚؒۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1710 implements InterfaceC2150 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final String f5682;

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC2150 f5683;

    public C1710(String str) {
        this.f5683 = InterfaceC2150.f7060;
        this.f5682 = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1710)) {
            return false;
        }
        C1710 c1710 = (C1710) obj;
        return this.f5682.equals(c1710.f5682) && this.f5683.equals(c1710.f5683);
    }

    public final int hashCode() {
        return this.f5683.hashCode() + (this.f5682.hashCode() * 31);
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥُ */
    public final Iterator mo1606() {
        return null;
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥّ */
    public final String mo1607() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥۜ */
    public final InterfaceC2150 mo1608(String str, C1489 c1489, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦؑ */
    public final Boolean mo1609() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦٛ */
    public final Double mo1610() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦۚ */
    public final InterfaceC2150 mo1611() {
        return new C1710(this.f5682, this.f5683.mo1611());
    }

    public C1710(String str, InterfaceC2150 interfaceC2150) {
        this.f5683 = interfaceC2150;
        this.f5682 = str;
    }
}
