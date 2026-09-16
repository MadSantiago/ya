package p000;

import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import ru.bluecat.yandexmapspatcher.p003ui.App;
import ru.bluecat.yandexmapspatcher.p003ui.MainActivity;

/* JADX INFO: renamed from: ۥ٘ؖٔؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1597 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f5363;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f5364;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f5365;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f5366;

    public /* synthetic */ C1597(C5362 c5362, C4773 c4773, C3222 c3222, AbstractC0210 abstractC0210) {
        this.f5366 = 6;
        this.f5365 = c5362;
        this.f5363 = c4773;
        this.f5364 = c3222;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x017c A[Catch: all -> 0x0177, TryCatch #3 {all -> 0x0177, blocks: (B:36:0x015a, B:40:0x0168, B:42:0x016e, B:44:0x0174, B:48:0x017c, B:49:0x0181, B:52:0x0189, B:54:0x019d, B:57:0x01b3, B:58:0x01cc, B:59:0x01cd, B:60:0x01eb), top: B:149:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0181 A[Catch: all -> 0x0177, TryCatch #3 {all -> 0x0177, blocks: (B:36:0x015a, B:40:0x0168, B:42:0x016e, B:44:0x0174, B:48:0x017c, B:49:0x0181, B:52:0x0189, B:54:0x019d, B:57:0x01b3, B:58:0x01cc, B:59:0x01cd, B:60:0x01eb), top: B:149:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0188  */
    /* JADX WARN: Code duplicated, block: B:52:0x0189 A[Catch: all -> 0x0177, TryCatch #3 {all -> 0x0177, blocks: (B:36:0x015a, B:40:0x0168, B:42:0x016e, B:44:0x0174, B:48:0x017c, B:49:0x0181, B:52:0x0189, B:54:0x019d, B:57:0x01b3, B:58:0x01cc, B:59:0x01cd, B:60:0x01eb), top: B:149:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:54:0x019d A[Catch: all -> 0x0177, TRY_LEAVE, TryCatch #3 {all -> 0x0177, blocks: (B:36:0x015a, B:40:0x0168, B:42:0x016e, B:44:0x0174, B:48:0x017c, B:49:0x0181, B:52:0x0189, B:54:0x019d, B:57:0x01b3, B:58:0x01cc, B:59:0x01cd, B:60:0x01eb), top: B:149:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:57:0x01b3 A[Catch: all -> 0x0177, TRY_ENTER, TryCatch #3 {all -> 0x0177, blocks: (B:36:0x015a, B:40:0x0168, B:42:0x016e, B:44:0x0174, B:48:0x017c, B:49:0x0181, B:52:0x0189, B:54:0x019d, B:57:0x01b3, B:58:0x01cc, B:59:0x01cd, B:60:0x01eb), top: B:149:0x015a }] */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x01b3, please report this as an issue */
    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i;
        C2567 c2567;
        C2793 c2793;
        boolean zM4840;
        int i2;
        C3453 c3453;
        int size;
        int i3 = this.f5366;
        int i4 = 15;
        int i5 = 7;
        int i6 = 0;
        InterfaceC0443 interfaceC0443 = null;
        C2358 c2358 = C2358.f7817;
        Object obj = this.f5364;
        Object obj2 = this.f5363;
        Object obj3 = this.f5365;
        switch (i3) {
            case 0:
                ((AbstractC1182) obj3).mo2504();
                C5592 c5592 = (C5592) ((C1414) obj2).f4869;
                int i7 = ((C4763) obj).f15714;
                do {
                    i = c5592.get();
                } while (!c5592.compareAndSet(i, ((i >>> 27) & 15) == i7 ? i - 1 : i));
                return c2358;
            case 1:
                C4153 c4153 = (C4153) obj3;
                InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj2;
                InterfaceC4367 interfaceC4367 = (InterfaceC4367) obj;
                if (c4153.m7347()) {
                    AbstractC2765.m5135(interfaceC4643, null, 0, new C0876(c4153, interfaceC0443, i6), 3);
                    interfaceC4367.setValue(Boolean.FALSE);
                }
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C1705 c1705 = (C1705) obj2;
                AbstractC2765.m5135((InterfaceC4643) obj3, null, 0, new C5697(c1705, interfaceC0443, i6), 3).mo859(new C0079(i5, c1705, (InterfaceC4745) obj));
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C3957 c3957 = (C3957) obj3;
                C2793 c2793M7111 = C3957.m7111(c3957, (AbstractC1311) obj2, (C5304) obj);
                if (c2793M7111 == null) {
                    return null;
                }
                C2567 c2568 = c3957.f13229;
                if (C4207.m7431(c2568.f8575, -1L)) {
                    AbstractC4690.m8035("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return c2793M7111.m5323(c2568.m4844(c2793M7111, c2568.m4843(), 0L) ^ (-9223372034707292160L));
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C2567 c2569 = (C2567) obj3;
                C4174 c4174 = (C4174) obj2;
                InterfaceC3762 interfaceC3762 = (InterfaceC3762) obj;
                C4228 c4228 = c2569.f8574;
                while (true) {
                    C0863 c0863 = (C0863) c4228.f14025;
                    int i8 = c0863.f3180;
                    if (i8 == 0) {
                        c2567 = c2569;
                    } else {
                        if (i8 == 0) {
                            C0178.m384("MutableVector is empty.");
                            return null;
                        }
                        C2793 c2794 = (C2793) ((C2769) c0863.f3182[i8 - 1]).f9188.mo449();
                        if (c2794 == null) {
                            c2567 = c2569;
                            zM4840 = true;
                        } else {
                            c2567 = c2569;
                            zM4840 = C2567.m4840(c2567, c2794, 0L, 0L, 3);
                        }
                        if (zM4840) {
                            C0863 c0864 = (C0863) c4228.f14025;
                            ((C2769) c0864.m1850(c0864.f3180 - 1)).f9187.mo335(c2358);
                            c2569 = c2567;
                        }
                    }
                }
                if (c2567.f8573 && (c2793 = (C2793) c2567.f8576.mo449()) != null && C2567.m4840(c2567, c2793, 0L, 0L, 3)) {
                    c2567.f8573 = false;
                }
                c4174.f13904 = c2567.m4842(interfaceC3762, 0L);
                return c2358;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                ((InterfaceC4367) obj3).setValue(Boolean.FALSE);
                App app = App.f407;
                C1443 c1443 = AbstractC2776.m5217().f409;
                c1443.getClass();
                C2518 c2518 = new C2518(c1443);
                c2518.m4661(AbstractC0973.m2052((C1347) obj), ((C1542) obj2).f5219);
                SharedPreferences.Editor editor = c2518.f8351;
                if (editor != null) {
                    editor.apply();
                }
                if (!C1443.f4940 && !c1443.f4943) {
                    try {
                        AbstractC2765.m5147(c1443.f4945, c1443.m3070().concat(".xml"));
                        break;
                    } catch (Throwable unused) {
                    }
                }
                return c2358;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                C5362 c5362 = (C5362) obj3;
                C4773 c4773 = (C4773) obj2;
                C3222 c3222 = (C3222) obj;
                C2024 c2024 = c5362.f17643;
                C4773 c4774 = (C4773) c2024.f6671;
                try {
                    c2024.f6671 = c4773;
                    C3222 c3223 = c5362.f17671;
                    int[] iArr = c5362.f17688;
                    C4912 c4912 = c5362.f17684;
                    c5362.f17688 = null;
                    c5362.f17684 = null;
                    try {
                        c5362.f17671 = c3222;
                        boolean z = c2024.f6664;
                        try {
                            c2024.f6664 = false;
                            c5362.m8959(null, null);
                            c2024.f6664 = z;
                            c5362.f17671 = c3223;
                            c5362.f17688 = iArr;
                            c5362.f17684 = c4912;
                            c2024.f6671 = c4774;
                            return c2358;
                        } catch (Throwable th) {
                            c2024.f6664 = z;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        c5362.f17671 = c3223;
                        c5362.f17688 = iArr;
                        c5362.f17684 = c4912;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c2024.f6671 = c4774;
                    throw th3;
                }
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                ConnectivityManager connectivityManager = (ConnectivityManager) obj2;
                C0291 c0291 = (C0291) obj;
                if (((C5662) obj3).f18631) {
                    C1984.m3874().m3878(AbstractC3182.f10689, "NetworkRequestConstraintController unregister callback");
                    connectivityManager.unregisterNetworkCallback(c0291);
                }
                return c2358;
            case 8:
                return new C2684((InterfaceC3275) ((InterfaceC4367) obj3).getValue(), (InterfaceC4745) ((InterfaceC4367) obj2).getValue(), ((Number) ((InterfaceC4448) obj).mo449()).intValue());
            case 9:
                C0846 c0846 = (C0846) obj2;
                C4801 c4801 = (C4801) ((C5704) obj3).getValue();
                return new C5440(c0846, c4801, (C4068) obj, new C3510((C3046) ((C3779) c0846.f3020.f15685).getValue(), c4801));
            case 10:
                MainActivity mainActivity = (MainActivity) obj3;
                File file = (File) obj2;
                C1489.m3097(C3133.m5792(mainActivity, new C4441(new long[]{4633335988504978431L, 929850290899634485L, 5388853672402456481L, -8748476321568558044L}).toString()), new C4441(new long[]{8485953621452035147L, 1750873630504489727L, 1143686849683168041L, -87525608692587478L}).toString(), new C3991((C2247) obj, 5));
                C1489 c1489M5792 = C3133.m5792(mainActivity, new C4441(new long[]{-9205436589168520742L, 725537658557729236L, -7361915933109929964L, 1354869551165623595L}).toString());
                String string = new C4441(new long[]{2087410175276436959L, -3341719911815799451L, -3570581845484414351L, -266285980940711910L}).toString();
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    long length = file.length();
                    if (length > 2147483647L) {
                        throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
                    }
                    int i9 = (int) length;
                    byte[] bArrCopyOf = new byte[i9];
                    int i10 = i9;
                    int i11 = 0;
                    while (i10 > 0) {
                        int i12 = fileInputStream.read(bArrCopyOf, i11, i10);
                        if (i12 < 0) {
                            if (i10 > 0) {
                                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i11);
                            } else {
                                i2 = fileInputStream.read();
                                if (i2 == -1) {
                                    c3453 = new C3453(8193);
                                    c3453.write(i2);
                                    AbstractC3831.m6845(fileInputStream, c3453);
                                    size = c3453.size() + i9;
                                    if (size >= 0) {
                                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                                    }
                                    byte[] bArrM6229 = c3453.m6229();
                                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                                    System.arraycopy(bArrM6229, 0, bArrCopyOf, i9, c3453.size());
                                }
                            }
                            fileInputStream.close();
                            c1489M5792.m3140(bArrCopyOf, string);
                            return c2358;
                        }
                        i10 -= i12;
                        i11 += i12;
                    }
                    if (i10 > 0) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i11);
                    } else {
                        i2 = fileInputStream.read();
                        if (i2 == -1) {
                            c3453 = new C3453(8193);
                            c3453.write(i2);
                            AbstractC3831.m6845(fileInputStream, c3453);
                            size = c3453.size() + i9;
                            if (size >= 0) {
                                throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                            }
                            byte[] bArrM62210 = c3453.m6229();
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                            System.arraycopy(bArrM62210, 0, bArrCopyOf, i9, c3453.size());
                        }
                    }
                    fileInputStream.close();
                    c1489M5792.m3140(bArrCopyOf, string);
                    return c2358;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        AbstractC4554.m7932(fileInputStream, th4);
                        throw th5;
                    }
                }
            case 11:
                InterfaceC4643 interfaceC4644 = (InterfaceC4643) obj2;
                C1705 c1706 = (C1705) obj;
                if (((Boolean) ((C1705) obj3).f5675.f14993.mo211(EnumC0845.f3015)).booleanValue()) {
                    AbstractC2765.m5135(interfaceC4644, null, 0, new C5697(c1706, interfaceC0443, 9), 3);
                }
                return Boolean.TRUE;
            case 12:
                C4356 c4356 = (C4356) obj3;
                C0126 c0126 = (C0126) obj2;
                InterfaceC4617 interfaceC4617 = (InterfaceC4617) obj;
                if (c4356 != null) {
                    c0126.m246(c0126.m231(c4356) - c0126.f488);
                }
                List listM3427 = AbstractC1631.m3427(c0126, null, c0126.f488, null);
                C1470 c1470 = (C1470) AbstractC0973.m2043(listM3427);
                Integer num = c1470 != null ? c1470.f5004 : null;
                List listMo5325 = interfaceC4617.mo5325(num);
                if (num != null && !listMo5325.isEmpty()) {
                    listMo5325 = AbstractC0973.m2049(Collections.singletonList(new C1470(((C1470) AbstractC0973.m2045(listMo5325)).f5005, null, num)), AbstractC0973.m2038(listMo5325));
                }
                return new C4335(AbstractC0973.m2049(listM3427, listMo5325), interfaceC4617.mo5326());
            case 13:
                C1347 c1347 = (C1347) obj3;
                C3557 c3557 = (C3557) obj2;
                ((InterfaceC4367) obj).setValue(Boolean.FALSE);
                if (!c1347.isEmpty()) {
                    if (((String) c3557.f11791.getValue()) == null) {
                        C3998.m7138(c3557.f11792, 0, null, 7);
                    } else {
                        AbstractC2765.m5135(AbstractC2776.m5210(c3557), null, 0, new C5030(c1347, c3557, interfaceC0443, i4), 3);
                    }
                }
                return c2358;
            case 14:
                C3557 c3558 = (C3557) obj3;
                C1225 c1225 = new C1225(22, (AbstractC0993) obj, c3558);
                c3558.getClass();
                C3557.m6353((C1347) obj2, c1225);
                String[] strArr = {new C4441(new long[]{1381279603497356804L, 8710888779138575240L, -4293349845388098868L, 5439526930977415725L, 65236200568220316L, -5279714407088054359L}).toString()};
                ExecutorService executorService = C3267.f10970;
                AbstractC2552.m4793(strArr).m7727();
                return c2358;
            default:
                C3557 c3559 = (C3557) obj3;
                InterfaceC1897 interfaceC1897 = (InterfaceC1897) obj;
                C1225 c1226 = new C1225(21, interfaceC1897, c3559);
                c3559.getClass();
                C3557.m6353((C1347) obj2, c1226);
                interfaceC1897.mo161();
                return c2358;
        }
    }

    public /* synthetic */ C1597(Object obj, Object obj2, Object obj3, int i) {
        this.f5366 = i;
        this.f5365 = obj;
        this.f5363 = obj2;
        this.f5364 = obj3;
    }
}
