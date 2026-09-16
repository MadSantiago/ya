package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: ۥۚؔؗۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2274 extends AbstractC0071 {
    public static final Parcelable.Creator<C2274> CREATOR = new C5229(0);

    /* JADX INFO: renamed from: ۥْ */
    public final long f7550;

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean f7551;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f7552;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f7553;

    public C2274(long j, String str, boolean z, int i) {
        this.f7553 = str;
        this.f7552 = i;
        this.f7550 = j;
        this.f7551 = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2274) {
            C2274 c2274 = (C2274) obj;
            if (AbstractC2164.m4207(this.f7553, c2274.f7553) && m4321() == c2274.m4321() && this.f7551 == c2274.f7551) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7553, Long.valueOf(m4321()), Boolean.valueOf(this.f7551)});
    }

    public final String toString() {
        C3369 c3369 = new C3369(this);
        c3369.m6135(this.f7553, "name");
        c3369.m6135(Long.valueOf(m4321()), "version");
        c3369.m6135(Boolean.valueOf(this.f7551), "is_fully_rolled_out");
        return c3369.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7775(parcel, 1, this.f7553);
        AbstractC4489.m7797(parcel, 2, 4);
        parcel.writeInt(this.f7552);
        long jM4321 = m4321();
        AbstractC4489.m7797(parcel, 3, 8);
        parcel.writeLong(jM4321);
        AbstractC4489.m7797(parcel, 4, 4);
        parcel.writeInt(this.f7551 ? 1 : 0);
        AbstractC4489.m7790(parcel, iM7800);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final long m4321() {
        long j = this.f7550;
        return j == -1 ? this.f7552 : j;
    }
}
