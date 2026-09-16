package p000;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۥٔؗٓۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1365 extends AbstractBinderC1892 implements InterfaceC0415 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ AtomicReference f4684;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1365(C5695 c5695, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f4684 = atomicReference;
    }

    @Override // p000.AbstractBinderC1892
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo479(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(C4012.CREATOR);
        AbstractC5564.m9347(parcel);
        mo925(arrayListCreateTypedArrayList);
        return true;
    }

    @Override // p000.InterfaceC0415
    /* JADX INFO: renamed from: ۦٖ */
    public final void mo925(List list) {
        AtomicReference atomicReference = this.f4684;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
