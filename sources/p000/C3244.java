package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: ۦؔٙؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3244 extends View.BaseSavedState {
    public static final Parcelable.Creator<C3244> CREATOR = new C1432(1);

    /* JADX INFO: renamed from: ۦۨ */
    public boolean f10887;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f10887 ? (byte) 1 : (byte) 0);
    }
}
