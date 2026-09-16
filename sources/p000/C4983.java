package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦۗؗٝۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4983 implements Parcelable {
    public static final Parcelable.Creator<C4983> CREATOR = new C1432(2);

    /* JADX INFO: renamed from: ۥؓ */
    public final ArrayList f16477;

    /* JADX INFO: renamed from: ۥؖ */
    public final ArrayList f16478;

    /* JADX INFO: renamed from: ۥَ */
    public final int f16479;

    /* JADX INFO: renamed from: ۥْ */
    public final int[] f16480;

    /* JADX INFO: renamed from: ۥٓ */
    public final int[] f16481;

    /* JADX INFO: renamed from: ۥٖ */
    public final String f16482;

    /* JADX INFO: renamed from: ۥٙ */
    public final CharSequence f16483;

    /* JADX INFO: renamed from: ۥۖ */
    public final CharSequence f16484;

    /* JADX INFO: renamed from: ۥۧ */
    public final boolean f16485;

    /* JADX INFO: renamed from: ۦٕ */
    public final int f16486;

    /* JADX INFO: renamed from: ۦٗ */
    public final int f16487;

    /* JADX INFO: renamed from: ۦۛ */
    public final int f16488;

    /* JADX INFO: renamed from: ۦ۟ */
    public final ArrayList f16489;

    /* JADX INFO: renamed from: ۦۨ */
    public final int[] f16490;

    public C4983(C2177 c2177) {
        int size = c2177.f7191.size();
        this.f16490 = new int[size * 6];
        if (!c2177.f7198) {
            C1078.m2276("Not on back stack");
            throw null;
        }
        this.f16489 = new ArrayList(size);
        this.f16480 = new int[size];
        this.f16481 = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C4088 c4088 = (C4088) c2177.f7191.get(i2);
            int i3 = i + 1;
            this.f16490[i] = c4088.f13654;
            ArrayList arrayList = this.f16489;
            AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = c4088.f13652;
            arrayList.add(abstractComponentCallbacksC0308 != null ? abstractComponentCallbacksC0308.f1118 : null);
            int[] iArr = this.f16490;
            iArr[i3] = c4088.f13649 ? 1 : 0;
            iArr[i + 2] = c4088.f13655;
            iArr[i + 3] = c4088.f13650;
            int i4 = i + 5;
            iArr[i + 4] = c4088.f13651;
            i += 6;
            iArr[i4] = c4088.f13657;
            this.f16480[i2] = c4088.f13653.ordinal();
            this.f16481[i2] = c4088.f13656.ordinal();
        }
        this.f16479 = c2177.f7186;
        this.f16482 = c2177.f7190;
        this.f16487 = c2177.f7184;
        this.f16488 = c2177.f7196;
        this.f16484 = c2177.f7195;
        this.f16486 = c2177.f7197;
        this.f16483 = c2177.f7193;
        this.f16478 = c2177.f7194;
        this.f16477 = c2177.f7199;
        this.f16485 = c2177.f7201;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f16490);
        parcel.writeStringList(this.f16489);
        parcel.writeIntArray(this.f16480);
        parcel.writeIntArray(this.f16481);
        parcel.writeInt(this.f16479);
        parcel.writeString(this.f16482);
        parcel.writeInt(this.f16487);
        parcel.writeInt(this.f16488);
        TextUtils.writeToParcel(this.f16484, parcel, 0);
        parcel.writeInt(this.f16486);
        TextUtils.writeToParcel(this.f16483, parcel, 0);
        parcel.writeStringList(this.f16478);
        parcel.writeStringList(this.f16477);
        parcel.writeInt(this.f16485 ? 1 : 0);
    }

    public C4983(Parcel parcel) {
        this.f16490 = parcel.createIntArray();
        this.f16489 = parcel.createStringArrayList();
        this.f16480 = parcel.createIntArray();
        this.f16481 = parcel.createIntArray();
        this.f16479 = parcel.readInt();
        this.f16482 = parcel.readString();
        this.f16487 = parcel.readInt();
        this.f16488 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f16484 = (CharSequence) creator.createFromParcel(parcel);
        this.f16486 = parcel.readInt();
        this.f16483 = (CharSequence) creator.createFromParcel(parcel);
        this.f16478 = parcel.createStringArrayList();
        this.f16477 = parcel.createStringArrayList();
        this.f16485 = parcel.readInt() != 0;
    }
}
