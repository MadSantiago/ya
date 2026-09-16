package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: ۥؑ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0222 extends AbstractBinderC1892 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f825;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f826 = 2;

    public BinderC0222(C2332 c2332) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.f825 = c2332;
    }

    @Override // p000.AbstractBinderC1892
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo479(int i, Parcel parcel, Parcel parcel2) {
        switch (this.f826) {
            case 0:
                if (i != 2) {
                    return false;
                }
                Status status = (Status) AbstractC5564.m9346(parcel, Status.CREATOR);
                byte[] bArrCreateByteArray = parcel.createByteArray();
                AbstractC5564.m9347(parcel);
                C2332 c2332 = (C2332) this.f825;
                if (status.f301 <= 0) {
                    try {
                        C2955 c2955 = C2955.f9912;
                        int i2 = AbstractC5529.f18251;
                        AbstractC2774.m5201(status, C5914.m9738(bArrCreateByteArray, C2955.f9911), c2332);
                    } catch (C5463 e) {
                        c2332.f7721.m6393(e);
                    }
                } else {
                    AbstractC2774.m5201(status, null, c2332);
                }
                return true;
            case 1:
                C2332 c2333 = (C2332) this.f825;
                switch (i) {
                    case 1:
                        Status status2 = (Status) AbstractC5564.m9346(parcel, Status.CREATOR);
                        AbstractC5564.m9347(parcel);
                        AbstractC2774.m5201(status2, null, c2333);
                        break;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        Status status3 = (Status) AbstractC5564.m9346(parcel, Status.CREATOR);
                        AbstractC5564.m9347(parcel);
                        AbstractC2774.m5201(status3, null, c2333);
                        break;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        Status status4 = (Status) AbstractC5564.m9346(parcel, Status.CREATOR);
                        AbstractC5564.m9347(parcel);
                        AbstractC2774.m5201(status4, null, c2333);
                        break;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        Status status5 = (Status) AbstractC5564.m9346(parcel, Status.CREATOR);
                        C4629 c4629 = (C4629) AbstractC5564.m9346(parcel, C4629.CREATOR);
                        AbstractC5564.m9347(parcel);
                        AbstractC2774.m5201(status5, c4629, c2333);
                        break;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        Status status6 = (Status) AbstractC5564.m9346(parcel, Status.CREATOR);
                        AbstractC5564.m9347(parcel);
                        AbstractC2774.m5201(status6, null, c2333);
                        break;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        Status status7 = (Status) AbstractC5564.m9346(parcel, Status.CREATOR);
                        C0439 c0439 = (C0439) AbstractC5564.m9346(parcel, C0439.CREATOR);
                        AbstractC5564.m9347(parcel);
                        AbstractC2774.m5201(status7, c0439, c2333);
                        break;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        Status status8 = (Status) AbstractC5564.m9346(parcel, Status.CREATOR);
                        C3390 c3390 = (C3390) AbstractC5564.m9346(parcel, C3390.CREATOR);
                        AbstractC5564.m9347(parcel);
                        AbstractC2774.m5201(status8, c3390, c2333);
                        break;
                    case 8:
                        Status status9 = (Status) AbstractC5564.m9346(parcel, Status.CREATOR);
                        AbstractC5564.m9347(parcel);
                        AbstractC2774.m5201(status9, null, c2333);
                        break;
                    case 9:
                        Status status10 = (Status) AbstractC5564.m9346(parcel, Status.CREATOR);
                        C5692 c5692 = (C5692) AbstractC5564.m9346(parcel, C5692.CREATOR);
                        AbstractC5564.m9347(parcel);
                        AbstractC2774.m5201(status10, c5692, c2333);
                        break;
                    case 10:
                        Status status11 = (Status) AbstractC5564.m9346(parcel, Status.CREATOR);
                        C4629 c46210 = (C4629) AbstractC5564.m9346(parcel, C4629.CREATOR);
                        AbstractC5564.m9347(parcel);
                        AbstractC2774.m5201(status11, c46210, c2333);
                        break;
                    case 11:
                        Status status12 = (Status) AbstractC5564.m9346(parcel, Status.CREATOR);
                        parcel.readLong();
                        AbstractC5564.m9347(parcel);
                        AbstractC2774.m5201(status12, null, c2333);
                        break;
                    case 12:
                        Status status13 = (Status) AbstractC5564.m9346(parcel, Status.CREATOR);
                        AbstractC5564.m9347(parcel);
                        AbstractC2774.m5201(status13, null, c2333);
                        break;
                    case 13:
                        Status status14 = (Status) AbstractC5564.m9346(parcel, Status.CREATOR);
                        C5033 c5033 = (C5033) AbstractC5564.m9346(parcel, C5033.CREATOR);
                        AbstractC5564.m9347(parcel);
                        AbstractC2774.m5201(status14, c5033, c2333);
                        break;
                    case 14:
                        Status status15 = (Status) AbstractC5564.m9346(parcel, Status.CREATOR);
                        AbstractC5564.m9347(parcel);
                        AbstractC2774.m5201(status15, null, c2333);
                        break;
                    case 15:
                        Status status16 = (Status) AbstractC5564.m9346(parcel, Status.CREATOR);
                        AbstractC5564.m9347(parcel);
                        AbstractC2774.m5201(status16, null, c2333);
                        break;
                    case 16:
                        Status status17 = (Status) AbstractC5564.m9346(parcel, Status.CREATOR);
                        long j = parcel.readLong();
                        AbstractC5564.m9347(parcel);
                        AbstractC2774.m5201(status17, Long.valueOf(j), c2333);
                        break;
                    default:
                        return false;
                }
                return true;
            default:
                if (i != 2) {
                    return false;
                }
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                AbstractC5564.m9347(parcel);
                C3743 c3743 = new C3743(this, bArrCreateByteArray2);
                C1795 c1795 = (C1795) this.f825;
                ((ExecutorC0170) c1795.f5994).execute(new RunnableC4985(16, c1795, c3743));
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0222(C1543 c1543, C1795 c1795) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.f825 = c1795;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0222(C1543 c1543, C2332 c2332) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.f825 = c2332;
    }
}
