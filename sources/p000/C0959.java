package p000;

import android.os.Parcel;

/* JADX INFO: renamed from: ۥٍؕٙٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0959 extends AbstractC4249 {
    /* JADX INFO: renamed from: ۥٌ */
    public final InterfaceC2410 m1991(BinderC1409 binderC1409, String str, int i, BinderC1409 binderC14010) {
        Parcel parcelM7504 = m7504();
        AbstractC3419.m6198(parcelM7504, binderC1409);
        parcelM7504.writeString(str);
        parcelM7504.writeInt(i);
        AbstractC3419.m6198(parcelM7504, binderC14010);
        Parcel parcelM7508 = m7508(parcelM7504, 8);
        InterfaceC2410 interfaceC2410M2975 = BinderC1409.m2975(parcelM7508.readStrongBinder());
        parcelM7508.recycle();
        return interfaceC2410M2975;
    }

    /* JADX INFO: renamed from: ۦَ */
    public final InterfaceC2410 m1992(BinderC1409 binderC1409, String str, int i) {
        Parcel parcelM7504 = m7504();
        AbstractC3419.m6198(parcelM7504, binderC1409);
        parcelM7504.writeString(str);
        parcelM7504.writeInt(i);
        Parcel parcelM7508 = m7508(parcelM7504, 4);
        InterfaceC2410 interfaceC2410M2975 = BinderC1409.m2975(parcelM7508.readStrongBinder());
        parcelM7508.recycle();
        return interfaceC2410M2975;
    }

    /* JADX INFO: renamed from: ۦۢ */
    public final InterfaceC2410 m1993(BinderC1409 binderC1409, String str, boolean z, long j) {
        Parcel parcelM7504 = m7504();
        AbstractC3419.m6198(parcelM7504, binderC1409);
        parcelM7504.writeString(str);
        parcelM7504.writeInt(z ? 1 : 0);
        parcelM7504.writeLong(j);
        Parcel parcelM7508 = m7508(parcelM7504, 7);
        InterfaceC2410 interfaceC2410M2975 = BinderC1409.m2975(parcelM7508.readStrongBinder());
        parcelM7508.recycle();
        return interfaceC2410M2975;
    }

    /* JADX INFO: renamed from: ۦۤ */
    public final InterfaceC2410 m1994(BinderC1409 binderC1409, String str, int i) {
        Parcel parcelM7504 = m7504();
        AbstractC3419.m6198(parcelM7504, binderC1409);
        parcelM7504.writeString(str);
        parcelM7504.writeInt(i);
        Parcel parcelM7508 = m7508(parcelM7504, 2);
        InterfaceC2410 interfaceC2410M2975 = BinderC1409.m2975(parcelM7508.readStrongBinder());
        parcelM7508.recycle();
        return interfaceC2410M2975;
    }
}
