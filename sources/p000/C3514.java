package p000;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: ۦٌؘؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3514 extends AbstractC0383 {

    /* JADX INFO: renamed from: ۥُ */
    public final Parcel f11633;

    /* JADX INFO: renamed from: ۥّ */
    public final int f11634;

    /* JADX INFO: renamed from: ۥۜ */
    public final String f11635;

    /* JADX INFO: renamed from: ۦؑ */
    public final SparseIntArray f11636;

    /* JADX INFO: renamed from: ۦِ */
    public int f11637;

    /* JADX INFO: renamed from: ۦٛ */
    public int f11638;

    /* JADX INFO: renamed from: ۦۗ */
    public int f11639;

    /* JADX INFO: renamed from: ۦۙ */
    public final int f11640;

    public C3514(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C4461(0), new C4461(0), new C4461(0));
    }

    @Override // p000.AbstractC0383
    /* JADX INFO: renamed from: ۥُ */
    public final boolean mo830(int i) {
        while (true) {
            int i2 = this.f11637;
            int i3 = this.f11639;
            if (i2 >= this.f11640) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.f11637;
            Parcel parcel = this.f11633;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.f11639 = parcel.readInt();
            this.f11637 += i5;
        }
    }

    @Override // p000.AbstractC0383
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo833(int i) {
        int i2 = this.f11638;
        SparseIntArray sparseIntArray = this.f11636;
        Parcel parcel = this.f11633;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.f11638 = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    @Override // p000.AbstractC0383
    /* JADX INFO: renamed from: ۥۣ */
    public final C3514 mo834() {
        Parcel parcel = this.f11633;
        int iDataPosition = parcel.dataPosition();
        int i = this.f11637;
        if (i == this.f11634) {
            i = this.f11640;
        }
        return new C3514(parcel, iDataPosition, i, AbstractC3761.m6621(new StringBuilder(), this.f11635, "  "), this.f1427, this.f1426, this.f1425);
    }

    public C3514(Parcel parcel, int i, int i2, String str, C4461 c4461, C4461 c4462, C4461 c4463) {
        super(c4461, c4462, c4463);
        this.f11636 = new SparseIntArray();
        this.f11638 = -1;
        this.f11639 = -1;
        this.f11633 = parcel;
        this.f11634 = i;
        this.f11640 = i2;
        this.f11637 = i;
        this.f11635 = str;
    }
}
