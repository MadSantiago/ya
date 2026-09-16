package p000;

/* JADX INFO: renamed from: ۦؘؙؖؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3322 extends AbstractC0868 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public int f11126;

    /* JADX INFO: renamed from: ۥْ */
    public int f11127;

    /* JADX INFO: renamed from: ۥٓ */
    public int f11128;

    /* JADX INFO: renamed from: ۥٖ */
    public int f11129;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ Object f11130;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C0111 f11131;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3322(C0111 c0111, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f11131 = c0111;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        C3322 c3322 = new C3322(this.f11131, interfaceC0443);
        c3322.f11130 = obj;
        return c3322;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        C0156 c0156;
        int i;
        int i2;
        int i3;
        String strM8670;
        int i4;
        int i5;
        String str;
        C0111 c0111 = this.f11131;
        C2730 c2730 = c0111.f443;
        C4523 c4523 = c0111.f440;
        int i6 = this.f11129;
        if (i6 == 0) {
            AbstractC0186.m409(obj);
            c0156 = (C0156) this.f11130;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f11126;
            i2 = this.f11128;
            i3 = this.f11127;
            c0156 = (C0156) this.f11130;
            AbstractC0186.m409(obj);
        }
        if (i3 >= Math.min(c0111.f441 + 10, c4523.f14948)) {
            return C2358.f7817;
        }
        int i7 = i3 + 1;
        int iM7840 = c4523.m7840(i3);
        switch (iM7840) {
            case 0:
                strM8670 = "up";
                break;
            case 1:
                Object objM5076 = c2730.m5076(i2);
                i2++;
                strM8670 = "down " + objM5076;
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                strM8670 = "remove " + c4523.m7840(i7) + ' ' + c4523.m7840(i3 + 2);
                i7 = i3 + 3;
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                strM8670 = "move " + c4523.m7840(i7) + ' ' + c4523.m7840(i3 + 2) + ' ' + c4523.m7840(i3 + 3);
                i7 = i3 + 4;
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                strM8670 = "clear";
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                i4 = i3 + 2;
                int iM7841 = c4523.m7840(i7);
                i5 = i2 + 1;
                str = "insertBottomUp " + iM7841 + ' ' + c2730.m5076(i2);
                int i8 = i4;
                strM8670 = str;
                i7 = i8;
                i2 = i5;
                break;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                i4 = i3 + 2;
                int iM7842 = c4523.m7840(i7);
                i5 = i2 + 1;
                str = "insertTopDown " + iM7842 + ' ' + c2730.m5076(i2);
                int i9 = i4;
                strM8670 = str;
                i7 = i9;
                i2 = i5;
                break;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                Object objM5077 = c2730.m5076(i2);
                AbstractC3801.m6782(2, objM5077);
                i2 += 2;
                strM8670 = "apply " + ((InterfaceC5731) objM5077);
                break;
            case 8:
                strM8670 = "reuse " + c0111.f442.m5076(i);
                i++;
                break;
            case 9:
                strM8670 = "recompose pending";
                break;
            default:
                strM8670 = AbstractC5078.m8670(iM7840, "unknown op: ");
                break;
        }
        this.f11130 = c0156;
        this.f11127 = i7;
        this.f11128 = i2;
        this.f11126 = i;
        this.f11129 = 1;
        c0156.m336(this, i3 + ": " + strM8670);
        return EnumC2282.f7590;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C3322) mo217((InterfaceC0443) obj2, (C0156) obj)).mo218(C2358.f7817);
    }
}
