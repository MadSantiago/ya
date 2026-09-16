package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۥٖؖٞٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1477 extends AbstractC0071 {
    public static final Parcelable.Creator<C1477> CREATOR = new C5229(22);

    /* JADX INFO: renamed from: ۥَ */
    public final String f5020;

    /* JADX INFO: renamed from: ۥْ */
    public final long f5021;

    /* JADX INFO: renamed from: ۥٓ */
    public final Long f5022;

    /* JADX INFO: renamed from: ۥٖ */
    public final String f5023;

    /* JADX INFO: renamed from: ۦٗ */
    public final Double f5024;

    /* JADX INFO: renamed from: ۦ۟ */
    public final String f5025;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f5026;

    public C1477(long j, Object obj, String str, String str2) {
        AbstractC0487.m1090(str);
        this.f5026 = 2;
        this.f5025 = str;
        this.f5021 = j;
        this.f5023 = str2;
        if (obj == null) {
            this.f5022 = null;
            this.f5024 = null;
            this.f5020 = null;
            return;
        }
        if (obj instanceof Long) {
            this.f5022 = (Long) obj;
            this.f5024 = null;
            this.f5020 = null;
        } else if (obj instanceof String) {
            this.f5022 = null;
            this.f5024 = null;
            this.f5020 = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                C1078.m2272("User attribute given of un-supported type");
                throw null;
            }
            this.f5022 = null;
            this.f5024 = (Double) obj;
            this.f5020 = null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C5229.m8858(this, parcel);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final Object m3090() {
        Long l = this.f5022;
        if (l != null) {
            return l;
        }
        Double d = this.f5024;
        if (d != null) {
            return d;
        }
        String str = this.f5020;
        if (str != null) {
            return str;
        }
        return null;
    }

    public C1477(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f5026 = i;
        this.f5025 = str;
        this.f5021 = j;
        this.f5022 = l;
        this.f5024 = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d;
        this.f5020 = str2;
        this.f5023 = str3;
    }

    public C1477(C1284 c1284) {
        this(c1284.f4388, c1284.f4385, c1284.f4384, c1284.f4386);
    }
}
