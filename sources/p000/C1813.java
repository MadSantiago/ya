package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: ۥؚٜؒ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1813 extends AbstractC4249 implements InterfaceC0257 {
    public C1813(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 2);
    }

    @Override // p000.InterfaceC0257
    /* JADX INFO: renamed from: ۥُ */
    public final int mo537() {
        Parcel parcelM7507 = m7507(m7504(), 2);
        int i = parcelM7507.readInt();
        parcelM7507.recycle();
        return i;
    }

    @Override // p000.InterfaceC0257
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo538(String str, String str2, Bundle bundle, long j) {
        Parcel parcelM7504 = m7504();
        parcelM7504.writeString(str);
        parcelM7504.writeString(str2);
        AbstractC5564.m9345(parcelM7504, bundle);
        parcelM7504.writeLong(j);
        m7505(parcelM7504, 1);
    }
}
