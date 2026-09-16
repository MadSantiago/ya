package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦٟؒؗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4837 implements InterfaceC2150 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final ArrayList f15930;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f15931;

    public C4837(String str, ArrayList arrayList) {
        this.f15931 = str;
        ArrayList arrayList2 = new ArrayList();
        this.f15930 = arrayList2;
        arrayList2.addAll(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4837)) {
            return false;
        }
        C4837 c4837 = (C4837) obj;
        String str = c4837.f15931;
        String str2 = this.f15931;
        if (str2 != null) {
            if (!str2.equals(str)) {
                return false;
            }
        } else if (str != null) {
            return false;
        }
        return this.f15930.equals(c4837.f15930);
    }

    public final int hashCode() {
        String str = this.f15931;
        return this.f15930.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥُ */
    public final Iterator mo1606() {
        return null;
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥّ */
    public final String mo1607() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥۜ */
    public final InterfaceC2150 mo1608(String str, C1489 c1489, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦؑ */
    public final Boolean mo1609() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦٛ */
    public final Double mo1610() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦۚ */
    public final InterfaceC2150 mo1611() {
        return this;
    }
}
