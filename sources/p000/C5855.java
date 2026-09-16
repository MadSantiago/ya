package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦُۨؑۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5855 extends AbstractC0071 {
    public static final Parcelable.Creator<C5855> CREATOR = new C5229(23);

    /* JADX INFO: renamed from: ۥؓ */
    public final int f19308;

    /* JADX INFO: renamed from: ۥؔ */
    public final String f19309;

    /* JADX INFO: renamed from: ۥؖ */
    public final long f19310;

    /* JADX INFO: renamed from: ۥً */
    public final boolean f19311;

    /* JADX INFO: renamed from: ۥَ */
    public final long f19312;

    /* JADX INFO: renamed from: ۥْ */
    public final String f19313;

    /* JADX INFO: renamed from: ۥٓ */
    public final String f19314;

    /* JADX INFO: renamed from: ۥٕ */
    public final long f19315;

    /* JADX INFO: renamed from: ۥٖ */
    public final long f19316;

    /* JADX INFO: renamed from: ۥ٘ */
    public final String f19317;

    /* JADX INFO: renamed from: ۥٙ */
    public final String f19318;

    /* JADX INFO: renamed from: ۥٛ */
    public final String f19319;

    /* JADX INFO: renamed from: ۥٝ */
    public final long f19320;

    /* JADX INFO: renamed from: ۥۖ */
    public final boolean f19321;

    /* JADX INFO: renamed from: ۥۙ */
    public final List f19322;

    /* JADX INFO: renamed from: ۥۤ */
    public final long f19323;

    /* JADX INFO: renamed from: ۥۦ */
    public final String f19324;

    /* JADX INFO: renamed from: ۥۧ */
    public final boolean f19325;

    /* JADX INFO: renamed from: ۦؒ */
    public final int f19326;

    /* JADX INFO: renamed from: ۦؖ */
    public final String f19327;

    /* JADX INFO: renamed from: ۦؗ */
    public final boolean f19328;

    /* JADX INFO: renamed from: ۦؙ */
    public final String f19329;

    /* JADX INFO: renamed from: ۦُ */
    public final long f19330;

    /* JADX INFO: renamed from: ۦٕ */
    public final long f19331;

    /* JADX INFO: renamed from: ۦٖ */
    public final int f19332;

    /* JADX INFO: renamed from: ۦٗ */
    public final String f19333;

    /* JADX INFO: renamed from: ۦٚ */
    public final Boolean f19334;

    /* JADX INFO: renamed from: ۦۛ */
    public final boolean f19335;

    /* JADX INFO: renamed from: ۦۜ */
    public final int f19336;

    /* JADX INFO: renamed from: ۦ۟ */
    public final String f19337;

    /* JADX INFO: renamed from: ۦۣ */
    public final long f19338;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f19339;

    public C5855(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        AbstractC0487.m1090(str);
        this.f19339 = str;
        this.f19337 = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f19313 = str3;
        this.f19331 = j;
        this.f19314 = str4;
        this.f19312 = j2;
        this.f19316 = j3;
        this.f19333 = str5;
        this.f19335 = z;
        this.f19321 = z2;
        this.f19318 = str6;
        this.f19310 = j4;
        this.f19308 = i;
        this.f19325 = z3;
        this.f19311 = z4;
        this.f19334 = bool;
        this.f19315 = j5;
        this.f19322 = list;
        this.f19329 = str7;
        this.f19327 = str8;
        this.f19324 = str9;
        this.f19328 = z5;
        this.f19330 = j6;
        this.f19332 = i2;
        this.f19309 = str10;
        this.f19336 = i3;
        this.f19338 = j7;
        this.f19317 = str11;
        this.f19319 = str12;
        this.f19323 = j8;
        this.f19326 = i4;
        this.f19320 = j9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7775(parcel, 2, this.f19339);
        AbstractC4489.m7775(parcel, 3, this.f19337);
        AbstractC4489.m7775(parcel, 4, this.f19313);
        AbstractC4489.m7775(parcel, 5, this.f19314);
        AbstractC4489.m7797(parcel, 6, 8);
        parcel.writeLong(this.f19312);
        AbstractC4489.m7797(parcel, 7, 8);
        parcel.writeLong(this.f19316);
        AbstractC4489.m7775(parcel, 8, this.f19333);
        AbstractC4489.m7797(parcel, 9, 4);
        parcel.writeInt(this.f19335 ? 1 : 0);
        AbstractC4489.m7797(parcel, 10, 4);
        parcel.writeInt(this.f19321 ? 1 : 0);
        AbstractC4489.m7797(parcel, 11, 8);
        parcel.writeLong(this.f19331);
        AbstractC4489.m7775(parcel, 12, this.f19318);
        AbstractC4489.m7797(parcel, 14, 8);
        parcel.writeLong(this.f19310);
        AbstractC4489.m7797(parcel, 15, 4);
        parcel.writeInt(this.f19308);
        AbstractC4489.m7797(parcel, 16, 4);
        parcel.writeInt(this.f19325 ? 1 : 0);
        AbstractC4489.m7797(parcel, 18, 4);
        parcel.writeInt(this.f19311 ? 1 : 0);
        Boolean bool = this.f19334;
        if (bool != null) {
            AbstractC4489.m7797(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        AbstractC4489.m7797(parcel, 22, 8);
        parcel.writeLong(this.f19315);
        List<String> list = this.f19322;
        if (list != null) {
            int iM7801 = AbstractC4489.m7800(parcel, 23);
            parcel.writeStringList(list);
            AbstractC4489.m7790(parcel, iM7801);
        }
        AbstractC4489.m7775(parcel, 25, this.f19329);
        AbstractC4489.m7775(parcel, 26, this.f19327);
        AbstractC4489.m7775(parcel, 27, this.f19324);
        AbstractC4489.m7797(parcel, 28, 4);
        parcel.writeInt(this.f19328 ? 1 : 0);
        AbstractC4489.m7797(parcel, 29, 8);
        parcel.writeLong(this.f19330);
        AbstractC4489.m7797(parcel, 30, 4);
        parcel.writeInt(this.f19332);
        AbstractC4489.m7775(parcel, 31, this.f19309);
        AbstractC4489.m7797(parcel, 32, 4);
        parcel.writeInt(this.f19336);
        AbstractC4489.m7797(parcel, 34, 8);
        parcel.writeLong(this.f19338);
        AbstractC4489.m7775(parcel, 35, this.f19317);
        AbstractC4489.m7775(parcel, 36, this.f19319);
        AbstractC4489.m7797(parcel, 37, 8);
        parcel.writeLong(this.f19323);
        AbstractC4489.m7797(parcel, 38, 4);
        parcel.writeInt(this.f19326);
        AbstractC4489.m7797(parcel, 39, 8);
        parcel.writeLong(this.f19320);
        AbstractC4489.m7790(parcel, iM7800);
    }

    public C5855(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, ArrayList arrayList, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        this.f19339 = str;
        this.f19337 = str2;
        this.f19313 = str3;
        this.f19331 = j3;
        this.f19314 = str4;
        this.f19312 = j;
        this.f19316 = j2;
        this.f19333 = str5;
        this.f19335 = z;
        this.f19321 = z2;
        this.f19318 = str6;
        this.f19310 = j4;
        this.f19308 = i;
        this.f19325 = z3;
        this.f19311 = z4;
        this.f19334 = bool;
        this.f19315 = j5;
        this.f19322 = arrayList;
        this.f19329 = str7;
        this.f19327 = str8;
        this.f19324 = str9;
        this.f19328 = z5;
        this.f19330 = j6;
        this.f19332 = i2;
        this.f19309 = str10;
        this.f19336 = i3;
        this.f19338 = j7;
        this.f19317 = str11;
        this.f19319 = str12;
        this.f19323 = j8;
        this.f19326 = i4;
        this.f19320 = j9;
    }
}
