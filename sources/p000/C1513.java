package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۥٗؒٗؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1513 extends AbstractC0071 {
    public static final Parcelable.Creator<C1513> CREATOR = new C1432(28);

    /* JADX INFO: renamed from: ۥَ */
    public boolean f5137;

    /* JADX INFO: renamed from: ۥْ */
    public C1477 f5138;

    /* JADX INFO: renamed from: ۥٓ */
    public long f5139;

    /* JADX INFO: renamed from: ۥٖ */
    public String f5140;

    /* JADX INFO: renamed from: ۥٙ */
    public final C2679 f5141;

    /* JADX INFO: renamed from: ۥۖ */
    public C2679 f5142;

    /* JADX INFO: renamed from: ۦٕ */
    public final long f5143;

    /* JADX INFO: renamed from: ۦٗ */
    public final C2679 f5144;

    /* JADX INFO: renamed from: ۦۛ */
    public long f5145;

    /* JADX INFO: renamed from: ۦ۟ */
    public String f5146;

    /* JADX INFO: renamed from: ۦۨ */
    public String f5147;

    public C1513(C1513 c1513) {
        AbstractC0487.m1047(c1513);
        this.f5147 = c1513.f5147;
        this.f5146 = c1513.f5146;
        this.f5138 = c1513.f5138;
        this.f5139 = c1513.f5139;
        this.f5137 = c1513.f5137;
        this.f5140 = c1513.f5140;
        this.f5144 = c1513.f5144;
        this.f5145 = c1513.f5145;
        this.f5142 = c1513.f5142;
        this.f5143 = c1513.f5143;
        this.f5141 = c1513.f5141;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7775(parcel, 2, this.f5147);
        AbstractC4489.m7775(parcel, 3, this.f5146);
        AbstractC4489.m7793(parcel, 4, this.f5138, i);
        long j = this.f5139;
        AbstractC4489.m7797(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.f5137;
        AbstractC4489.m7797(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        AbstractC4489.m7775(parcel, 7, this.f5140);
        AbstractC4489.m7793(parcel, 8, this.f5144, i);
        long j2 = this.f5145;
        AbstractC4489.m7797(parcel, 9, 8);
        parcel.writeLong(j2);
        AbstractC4489.m7793(parcel, 10, this.f5142, i);
        AbstractC4489.m7797(parcel, 11, 8);
        parcel.writeLong(this.f5143);
        AbstractC4489.m7793(parcel, 12, this.f5141, i);
        AbstractC4489.m7790(parcel, iM7800);
    }

    public C1513(String str, String str2, C1477 c1477, long j, boolean z, String str3, C2679 c2679, long j2, C2679 c26710, long j3, C2679 c26711) {
        this.f5147 = str;
        this.f5146 = str2;
        this.f5138 = c1477;
        this.f5139 = j;
        this.f5137 = z;
        this.f5140 = str3;
        this.f5144 = c2679;
        this.f5145 = j2;
        this.f5142 = c26710;
        this.f5143 = j3;
        this.f5141 = c26711;
    }
}
