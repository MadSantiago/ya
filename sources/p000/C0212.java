package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۥۣؑؖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0212 implements Map.Entry, Cloneable {

    /* JADX INFO: renamed from: ۥْ */
    public C3108 f797;

    /* JADX INFO: renamed from: ۦ۟ */
    public String f798;

    /* JADX INFO: renamed from: ۦۨ */
    public String f799;

    public final Object clone() {
        try {
            return (C0212) super.clone();
        } catch (CloneNotSupportedException e) {
            C5028.m8450(e);
            return null;
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0212.class == obj.getClass()) {
            C0212 c0212 = (C0212) obj;
            String str = this.f799;
            String str2 = c0212.f799;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.f798;
            String str4 = c0212.f798;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f799;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f798;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.f799;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f798;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        String str;
        String str2 = (String) obj;
        C3108 c3108 = this.f797;
        String str3 = this.f799;
        int iM5688 = c3108.m5688(str3);
        String str4 = "";
        if (iM5688 != -1 && (str = c3108.f10421[iM5688]) != null) {
            str4 = str;
        }
        int iM5689 = c3108.m5688(str3);
        if (iM5689 != -1) {
            c3108.f10421[iM5689] = str2;
        }
        this.f798 = str2;
        return str4;
    }
}
