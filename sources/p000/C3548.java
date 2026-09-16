package p000;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: renamed from: ۦؙؔۤؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3548 extends C2818 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ int f11779;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3548(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.f11779 = i3;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0135 A[LOOP:4: B:64:0x0107->B:74:0x0135, LOOP_END] */
    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        ContentCaptureSession contentCaptureSessionM8789;
        C2457 c2457;
        char c;
        int i = this.f11779;
        Object obj = this.f11309;
        switch (i) {
            case 0:
                View view = (View) obj;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    AbstractC5604.m9458(view);
                }
                if (i2 < 29 || (contentCaptureSessionM8789 = AbstractC5183.m8789(view)) == null) {
                    return null;
                }
                return new C5002(14, contentCaptureSessionM8789, view);
            case 1:
                ((C2606) obj).getClass();
                return Boolean.valueOf(AbstractC0684.m1527(Thread.currentThread().getName(), "Firebase Background Thread #", false));
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ((C2606) obj).getClass();
                return Boolean.valueOf(AbstractC0684.m1527(Thread.currentThread().getName(), "Firebase Blocking Thread #", false));
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return ((InterfaceC3320) obj).mo776();
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C1822 c1822 = (C1822) obj;
                C3639 c3639 = c1822.f6052;
                C3639 c36310 = c1822.f6056;
                C2016 c2016 = c1822.f6055;
                C3468 c3468M3926 = c2016.m3926();
                char c2 = 7;
                EnumC4125 enumC4125 = EnumC4125.f13739;
                if (c3468M3926 == null) {
                    Object[] objArr = c36310.f12174;
                    long[] jArr = c36310.f12175;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << c2) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                int i5 = 0;
                                while (i5 < i4) {
                                    if ((j & 255) < 128) {
                                        ((InterfaceC3392) objArr[(i3 << 3) + i5]).mo2392(enumC4125);
                                    }
                                    j >>= 8;
                                    i5++;
                                    c2 = c2;
                                }
                                c = c2;
                                if (i4 == 8) {
                                }
                            } else {
                                c = c2;
                            }
                            if (i3 != length) {
                                i3++;
                                c2 = c;
                            }
                        }
                    }
                } else if (c3468M3926.f17786) {
                    if (c3639.m6490(c3468M3926)) {
                        c3468M3926.m6252();
                    }
                    EnumC4125 enumC4125M6254 = c3468M3926.m6254();
                    if (!c3468M3926.f17791.f17786) {
                        AbstractC3480.m6278("visitAncestors called on an unattached node");
                    }
                    AbstractC5381 abstractC5381 = c3468M3926.f17791;
                    C0605 c0605M9270 = AbstractC5537.m9270(c3468M3926);
                    int i6 = 0;
                    while (c0605M9270 != null) {
                        if ((((AbstractC5381) c0605M9270.f2256.f8210).f17782 & 5120) != 0) {
                            while (abstractC5381 != null) {
                                int i7 = abstractC5381.f17781;
                                if ((i7 & 5120) != 0) {
                                    if ((i7 & 1024) != 0) {
                                        i6++;
                                    }
                                    if ((abstractC5381 instanceof InterfaceC3392) && c36310.m6490(abstractC5381)) {
                                        if (i6 <= 1) {
                                            ((InterfaceC3392) abstractC5381).mo2392(enumC4125M6254);
                                        } else {
                                            ((InterfaceC3392) abstractC5381).mo2392(EnumC4125.f13741);
                                        }
                                        c36310.m6497(abstractC5381);
                                    }
                                }
                                abstractC5381 = abstractC5381.f17780;
                            }
                        }
                        c0605M9270 = c0605M9270.m1356();
                        abstractC5381 = (c0605M9270 == null || (c2457 = c0605M9270.f2256) == null) ? null : (C1850) c2457.f8202;
                    }
                    Object[] objArr2 = c36310.f12174;
                    long[] jArr2 = c36310.f12175;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j2 = jArr2[i8];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                for (int i10 = 0; i10 < i9; i10++) {
                                    if ((j2 & 255) < 128) {
                                        ((InterfaceC3392) objArr2[(i8 << 3) + i10]).mo2392(enumC4125);
                                    }
                                    j2 >>= 8;
                                }
                                if (i9 == 8) {
                                    if (i8 != length2) {
                                        i8++;
                                    }
                                }
                            } else if (i8 != length2) {
                                i8++;
                            }
                        }
                    }
                }
                if (c2016.m3926() == null || c2016.f6637.m6254() == enumC4125) {
                    c2016.m3924();
                }
                c3639.m6493();
                c36310.m6493();
                c1822.f6053 = false;
                return C2358.f7817;
            default:
                return Boolean.valueOf(C3468.m6247(((C3165) obj).f10653));
        }
    }
}
