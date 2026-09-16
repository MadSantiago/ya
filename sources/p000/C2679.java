package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۥٕۤؕؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2679 extends AbstractC0071 {
    public static final Parcelable.Creator<C2679> CREATOR = new C5229(2);

    /* JADX INFO: renamed from: ۥَ */
    public final long f8885;

    /* JADX INFO: renamed from: ۥْ */
    public final String f8886;

    /* JADX INFO: renamed from: ۥٓ */
    public final long f8887;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C5645 f8888;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f8889;

    public C2679(C2679 c2679, long j, long j2) {
        AbstractC0487.m1047(c2679);
        this.f8889 = c2679.f8889;
        this.f8888 = c2679.f8888;
        this.f8886 = c2679.f8886;
        this.f8887 = j;
        this.f8885 = j2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f8888);
        String str = this.f8886;
        int length = String.valueOf(str).length();
        String str2 = this.f8889;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        return AbstractC3761.m6621(sb, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C5229.m8859(this, parcel, i);
    }

    public C2679(String str, C5645 c5645, String str2, long j, long j2) {
        this.f8889 = str;
        this.f8888 = c5645;
        this.f8886 = str2;
        this.f8887 = j;
        this.f8885 = j2;
    }
}
