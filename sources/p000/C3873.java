package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦَؙٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3873 extends AbstractC4249 implements InterfaceC5253 {
    public C3873(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 2);
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۥؓ */
    public final void mo6903(long j, String str, String str2, String str3) {
        Parcel parcelM7504 = m7504();
        parcelM7504.writeLong(j);
        parcelM7504.writeString(str);
        parcelM7504.writeString(str2);
        parcelM7504.writeString(str3);
        m7505(parcelM7504, 10);
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۥّ */
    public final C1103 mo6904(C5855 c5855) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c5855);
        Parcel parcelM7507 = m7507(parcelM7504, 21);
        C1103 c1103 = (C1103) AbstractC5564.m9346(parcelM7507, C1103.CREATOR);
        parcelM7507.recycle();
        return c1103;
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۥْ */
    public final byte[] mo6905(String str, C2679 c2679) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c2679);
        parcelM7504.writeString(str);
        Parcel parcelM7507 = m7507(parcelM7504, 9);
        byte[] bArrCreateByteArray = parcelM7507.createByteArray();
        parcelM7507.recycle();
        return bArrCreateByteArray;
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۥ٘ */
    public final void mo6906(C5855 c5855) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c5855);
        m7505(parcelM7504, 18);
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۥٙ */
    public final void mo6907(C5855 c5855, C3954 c3954, InterfaceC0277 interfaceC0277) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c5855);
        AbstractC5564.m9345(parcelM7504, c3954);
        AbstractC5564.m9344(parcelM7504, interfaceC0277);
        m7505(parcelM7504, 29);
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo6908(Bundle bundle, C5855 c5855) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, bundle);
        AbstractC5564.m9345(parcelM7504, c5855);
        m7505(parcelM7504, 19);
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۥۤ */
    public final void mo6909(C5855 c5855) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c5855);
        m7505(parcelM7504, 20);
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۥۥ */
    public final void mo6910(C5855 c5855, Bundle bundle, InterfaceC0415 interfaceC0415) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c5855);
        AbstractC5564.m9345(parcelM7504, bundle);
        AbstractC5564.m9344(parcelM7504, interfaceC0415);
        m7505(parcelM7504, 31);
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۥۨ */
    public final void mo6911(C5855 c5855) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c5855);
        m7505(parcelM7504, 26);
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦؔ */
    public final String mo6912(C5855 c5855) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c5855);
        Parcel parcelM7507 = m7507(parcelM7504, 11);
        String string = parcelM7507.readString();
        parcelM7507.recycle();
        return string;
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦؖ */
    public final void mo6913(C5855 c5855) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c5855);
        m7505(parcelM7504, 25);
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦؙ */
    public final List mo6914(String str, String str2, String str3) {
        Parcel parcelM7504 = m7504();
        parcelM7504.writeString(null);
        parcelM7504.writeString(str2);
        parcelM7504.writeString(str3);
        Parcel parcelM7507 = m7507(parcelM7504, 17);
        ArrayList arrayListCreateTypedArrayList = parcelM7507.createTypedArrayList(C1513.CREATOR);
        parcelM7507.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦُ */
    public final List mo6915(String str, String str2, C5855 c5855) {
        Parcel parcelM7504 = m7504();
        parcelM7504.writeString(str);
        parcelM7504.writeString(str2);
        AbstractC5564.m9345(parcelM7504, c5855);
        Parcel parcelM7507 = m7507(parcelM7504, 16);
        ArrayList arrayListCreateTypedArrayList = parcelM7507.createTypedArrayList(C1513.CREATOR);
        parcelM7507.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦِ */
    public final List mo6916(String str, String str2, String str3, boolean z) {
        Parcel parcelM7504 = m7504();
        parcelM7504.writeString(null);
        parcelM7504.writeString(str2);
        parcelM7504.writeString(str3);
        ClassLoader classLoader = AbstractC5564.f18370;
        parcelM7504.writeInt(z ? 1 : 0);
        Parcel parcelM7507 = m7507(parcelM7504, 15);
        ArrayList arrayListCreateTypedArrayList = parcelM7507.createTypedArrayList(C1477.CREATOR);
        parcelM7507.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦٗ */
    public final void mo6917(C5855 c5855) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c5855);
        m7505(parcelM7504, 4);
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦٝ */
    public final List mo6918(String str, String str2, boolean z, C5855 c5855) {
        Parcel parcelM7504 = m7504();
        parcelM7504.writeString(str);
        parcelM7504.writeString(str2);
        ClassLoader classLoader = AbstractC5564.f18370;
        parcelM7504.writeInt(z ? 1 : 0);
        AbstractC5564.m9345(parcelM7504, c5855);
        Parcel parcelM7507 = m7507(parcelM7504, 14);
        ArrayList arrayListCreateTypedArrayList = parcelM7507.createTypedArrayList(C1477.CREATOR);
        parcelM7507.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦٞ */
    public final void mo6919(C5855 c5855, C0323 c0323) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c5855);
        AbstractC5564.m9345(parcelM7504, c0323);
        m7505(parcelM7504, 30);
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦۜ */
    public final void mo6920(C5855 c5855) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c5855);
        m7505(parcelM7504, 27);
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦ۠ */
    public final void mo6921(C1477 c1477, C5855 c5855) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c1477);
        AbstractC5564.m9345(parcelM7504, c5855);
        m7505(parcelM7504, 2);
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦۣ */
    public final void mo6922(C2679 c2679, C5855 c5855) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c2679);
        AbstractC5564.m9345(parcelM7504, c5855);
        m7505(parcelM7504, 1);
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦۧ */
    public final void mo6923(C5855 c5855) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c5855);
        m7505(parcelM7504, 6);
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo6924(C1513 c1513, C5855 c5855) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c1513);
        AbstractC5564.m9345(parcelM7504, c5855);
        m7505(parcelM7504, 12);
    }
}
