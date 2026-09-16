package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.UserManager;
import android.text.Layout;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: ۥۡؓۗٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2552 {

    /* JADX INFO: renamed from: ۥؗ */
    public static C1984 f8511;

    /* JADX INFO: renamed from: ۥۗ */
    public static boolean f8514;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3267[] f8516 = new C3267[1];

    /* JADX INFO: renamed from: ۦؑ */
    public static final C0286 f8517 = new C0286(-1.0f);

    /* JADX INFO: renamed from: ۥُ */
    public static final C0286 f8512 = new C0286(1.0f);

    /* JADX INFO: renamed from: ۥّ */
    public static final C0857 f8513 = new C0857(-2074034050, new C2463(18), false);

    /* JADX INFO: renamed from: ۦۙ */
    public static final C0857 f8519 = new C0857(-1468225625, new C2463(19), false);

    /* JADX INFO: renamed from: ۥۜ */
    public static final C4036 f8515 = new C4036(9);

    /* JADX INFO: renamed from: ۦٛ */
    public static final C0809 f8518 = new C0809(2);

    /* JADX INFO: renamed from: ۥؓ */
    public static InterfaceFutureC4378 m4791(InterfaceFutureC4378 interfaceFutureC4378) {
        if (interfaceFutureC4378.isDone()) {
            return interfaceFutureC4378;
        }
        RunnableC3601 runnableC3601 = new RunnableC3601();
        runnableC3601.f11996 = interfaceFutureC4378;
        interfaceFutureC4378.mo3760(runnableC3601, EnumC0486.f1767);
        return runnableC3601;
    }

    /* JADX INFO: renamed from: ۥؔ */
    public static void m4792(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        m4820(byteArrayOutputStream, i, 2);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static C4432 m4793(String... strArr) {
        C4432 c4432 = new C4432();
        ArrayList arrayList = C4432.f14607;
        c4432.f14611 = arrayList;
        c4432.f14608 = arrayList;
        c4432.m7724(strArr);
        return c4432;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m4794(C5091 c5091, Context context, final boolean z, final String str, final long j) {
        if (C3346.m6107(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) AbstractC0949.f3364.mo211(context2);
        if (list.isEmpty()) {
            return;
        }
        C2730 c2730 = c5091.f16885;
        C2730 c2731 = c5091.f16885;
        C1727 c1727 = C1727.f5753;
        c2730.m5079(c1727);
        int size = list.size();
        int i = 0;
        while (i < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            c2731.m5079(new C3064(new C1522(i), resolveInfo.loadLabel(packageManager).toString(), 0, new InterfaceC4745() { // from class: ۦْٔؒۨ
                @Override // p000.InterfaceC4745
                /* JADX INFO: renamed from: ۦؚ */
                public final Object mo211(Object obj) {
                    AbstractC0949.f3365.mo1670(context2, resolveInfo, Boolean.valueOf(z), str, new C3346(j));
                    ((InterfaceC0647) obj).close();
                    return C2358.f7817;
                }
            }));
            i++;
            context2 = context;
        }
        c2731.m5079(c1727);
    }

    /* JADX INFO: renamed from: ۥً */
    public static byte[] m4795(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                C1078.m2276(AbstractC5078.m8670(i, "Not enough bytes to read: "));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۥَ */
    public static final int m4796(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        C1078.m2272(AbstractC5078.m8681(i, "Could not convert ", " to OutOfQuotaPolicy"));
        return 0;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final LinkedHashSet m4797(byte[] bArr) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        linkedHashSet.add(new C5628(objectInputStream.readBoolean(), Uri.parse(objectInputStream.readUTF())));
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC4554.m7932(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC4554.m7932(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final void m4798(long j, EnumC1616 enumC1616) {
        if (enumC1616 == EnumC1616.f5425) {
            if (C3693.m6551(j) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC4690.m8035("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (C3693.m6556(j) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC4690.m8035("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    /* JADX INFO: renamed from: ۥْ */
    public static final int m4799(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        C1078.m2272(AbstractC5078.m8681(i, "Could not convert ", " to BackoffPolicy"));
        return 0;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static final int m4800(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return 6;
        }
        C1078.m2272(AbstractC5078.m8681(i, "Could not convert ", " to NetworkType"));
        return 0;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public static long m4801(InputStream inputStream, int i) throws IOException {
        byte[] bArrM4795 = m4795(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM4795[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static final EnumC4972 m4802(int i) {
        if (i == 0) {
            return EnumC4972.f16455;
        }
        if (i == 1) {
            return EnumC4972.f16454;
        }
        if (i == 2) {
            return EnumC4972.f16450;
        }
        if (i == 3) {
            return EnumC4972.f16451;
        }
        if (i == 4) {
            return EnumC4972.f16449;
        }
        if (i == 5) {
            return EnumC4972.f16452;
        }
        C1078.m2272(AbstractC5078.m8681(i, "Could not convert ", " to State"));
        return null;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static HashSet m4803(int i) {
        int i2;
        if (i < 3) {
            AbstractC3933.m7099(i, "expectedSize");
            i2 = i + 1;
        } else {
            i2 = i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE;
        }
        return new HashSet(i2);
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static final InterfaceC0705 m4804(InterfaceC0705 interfaceC0705, InterfaceC3602 interfaceC3602, InterfaceC5635 interfaceC5635, EnumC1616 enumC1616, boolean z) {
        return interfaceC0705.mo1571(new C3479(interfaceC3602, interfaceC5635, enumC1616, z));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m4805(final boolean z, final int i, final C3635 c3635, C5362 c5362, final int i2) {
        int i3;
        C2449 c2449M9648;
        c5362.m8979(-1344558920);
        if ((i2 & 6) == 0) {
            i3 = (c5362.m9006(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c5362.m8988(AbstractC3761.m6632(i)) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c5362.m8977(c3635) ? 256 : 128;
        }
        if (c5362.m9011(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 14;
            boolean zM8963 = (i4 == 4) | c5362.m8963(c3635);
            Object objM8999 = c5362.m8999();
            C4036 c4036 = C2850.f9517;
            if (zM8963 || objM8999 == c4036) {
                objM8999 = new C4748(c3635, z);
                c5362.m8987(objM8999);
            }
            InterfaceC1126 interfaceC1126 = (InterfaceC1126) objM8999;
            boolean zM8977 = (i4 == 4) | c5362.m8977(c3635);
            Object objM89910 = c5362.m8999();
            if (zM8977 || objM89910 == c4036) {
                objM89910 = new C2428(c3635, z);
                c5362.m8987(objM89910);
            }
            InterfaceC3457 interfaceC3457 = (InterfaceC3457) objM89910;
            boolean zM6114 = C3346.m6114(c3635.m6479().f18943);
            int i5 = (int) (z ? c3635.m6479().f18943 >> 32 : c3635.m6479().f18943 & 4294967295L);
            C5837 c5837 = c3635.f12150;
            float fM1627 = 0.0f;
            if (c5837 != null && (c2449M9648 = c5837.m9648()) != null) {
                C3828 c3828 = c2449M9648.f8158;
                if (i5 >= 0) {
                    C2537 c2537 = c3828.f12697;
                    C2276 c2276 = c3828.f12696;
                    if (c2537.f8430.f4307.length() != 0) {
                        int iMin = Math.min(c2276.m4335(i5), Math.min(c2276.f7561 - 1, c2276.f7560 - 1));
                        if (i5 <= c2276.m4329(iMin, false)) {
                            c2276.m4337(iMin);
                            ArrayList arrayList = c2276.f7562;
                            C0158 c0158 = (C0158) arrayList.get(C3133.m5810(iMin, arrayList));
                            C4303 c4303 = c0158.f601;
                            int i6 = iMin - c0158.f602;
                            C0739 c0739 = c4303.f14237;
                            fM1627 = c0739.m1627(i6) - c0739.m1630(i6);
                        }
                    }
                }
            }
            float f = fM1627;
            boolean zM8978 = c5362.m8977(interfaceC1126);
            Object objM89911 = c5362.m8999();
            if (zM8978 || objM89911 == c4036) {
                objM89911 = new C5410(7, interfaceC1126);
                c5362.m8987(objM89911);
            }
            C4773.m8151(interfaceC3457, z, i, zM6114, 0L, f, AbstractC2995.m5588(C4217.f13994, interfaceC1126, (PointerInputEventHandler) objM89911), c5362, (i3 << 3) & 1008);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731() { // from class: ۥؘّٟؓ
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM6835 = AbstractC3831.m6835(i2 | 1);
                    AbstractC2552.m4805(z, i, c3635, (C5362) obj, iM6835);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static final int m4806(EnumC4972 enumC4972) {
        int iOrdinal = enumC4972.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        C1078.m2275();
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥۜ */
    public static final Object m4807(InterfaceC4825 interfaceC4825, AbstractC2266 abstractC2266) {
        if (!((AbstractC5381) interfaceC4825).f17791.f17786) {
            AbstractC3480.m6278("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        C2103 c2103 = (C2103) AbstractC5537.m9270(interfaceC4825).f2247;
        c2103.getClass();
        return C3133.m5778(c2103, abstractC2266);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3915 m4808(C0971 c0971, String str) {
        return new C3915(str, c0971.f3430);
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static final C3783 m4809(byte[] bArr) throws IOException {
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new C3783(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                C3783 c3783M7927 = AbstractC4554.m7927(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return c3783M7927;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC4554.m7932(objectInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC4554.m7932(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static final Object m4810(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final InterfaceC0705 m4811(InterfaceC0705 interfaceC0705, C4762 c4762) {
        return interfaceC0705.mo1571(new C1136(c4762));
    }

    /* JADX INFO: renamed from: ۦؖ */
    public static final void m4812(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static final int m4813(AbstractC3831 abstractC3831, int i) {
        if (abstractC3831 instanceof C0189) {
            return ((C0189) abstractC3831).f704;
        }
        int iM6632 = AbstractC3761.m6632(i);
        if (iM6632 == 0) {
            return Integer.MIN_VALUE;
        }
        if (iM6632 == 1) {
            return Integer.MAX_VALUE;
        }
        C1078.m2275();
        return 0;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public static final void m4814(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static C3267 m4815() {
        C3267 c3267;
        C3267[] c3267Arr = f8516;
        synchronized (c3267Arr) {
            try {
                c3267 = c3267Arr[0];
                if (c3267 != null && c3267.f10979 < 0) {
                    c3267 = null;
                    c3267Arr[0] = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3267;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static Object m4816(Future future) {
        Object obj;
        if (!future.isDone()) {
            C1078.m2276(C5063.m8650("Future was expected to be done: %s", future));
            return null;
        }
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۦُ */
    public static final C0969 m4817(int i, C5362 c5362) {
        C0842 c0842 = (C0842) c5362.m8997(AbstractC5420.f17895);
        int iM6632 = AbstractC3761.m6632(i);
        if (iM6632 == 0) {
            c0842.getClass();
            return C0842.f3007;
        }
        if (iM6632 == 1) {
            c0842.getClass();
            return C0842.f3004;
        }
        if (iM6632 == 2) {
            c0842.getClass();
            return C0842.f3009;
        }
        if (iM6632 == 3) {
            c0842.getClass();
            return C0842.f3005;
        }
        if (iM6632 == 4) {
            c0842.getClass();
            return C0842.f3006;
        }
        if (iM6632 == 5) {
            c0842.getClass();
            return C0842.f3010;
        }
        C1078.m2275();
        return null;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static synchronized C3267 m4818() {
        C3267 c3267M4815;
        try {
            c3267M4815 = m4815();
            if (c3267M4815 == null) {
                if (f8514) {
                    throw new C0887("The main shell died during initialization");
                }
                f8514 = true;
                C1984 c1984 = f8511;
                if (c1984 == null) {
                    c1984 = new C1984();
                    f8511 = c1984;
                }
                c3267M4815 = c1984.m3881();
                f8514 = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c3267M4815;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static final C2346 m4819(InterfaceC5731 interfaceC5731, InterfaceC4745 interfaceC4745) {
        C2928 c2928 = new C2928(interfaceC5731);
        AbstractC3801.m6782(1, interfaceC4745);
        return new C2346(7, c2928, interfaceC4745);
    }

    /* JADX INFO: renamed from: ۦٖ */
    public static void m4820(OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static final boolean m4821(C3635 c3635, boolean z) {
        InterfaceC2015 interfaceC2015M9643;
        C5837 c5837 = c3635.f12150;
        if (c5837 == null || (interfaceC2015M9643 = c5837.m9643()) == null) {
            return false;
        }
        C2793 c2793M3363 = AbstractC1605.m3363(interfaceC2015M9643);
        long jM6481 = c3635.m6481(z);
        float f = c2793M3363.f9343;
        float f2 = c2793M3363.f9341;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM6481 >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = c2793M3363.f9342;
        float f4 = c2793M3363.f9344;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM6481 & 4294967295L));
        return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public static byte[] m4822(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static final File m4823(Context context, String str) {
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static final C3000 m4824(C3504 c3504, int i, long j, C3144 c3144, long j2, C4274 c4274, EnumC2459 enumC2459, int i2, C4912 c4912) {
        List list;
        Object objMo5820 = c3144.mo5820(i);
        List list2 = (List) c4912.m9571(i);
        if (list2 != null) {
            list = list2;
        } else {
            List listM6292 = c3504.m6292(i);
            int size = listM6292.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(((InterfaceC1827) listM6292.get(i3)).mo3597(j));
            }
            c4912.m8319(i, arrayList);
            list = arrayList;
        }
        return new C3000(i, i2, list, j2, objMo5820, c4274, enumC2459);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static byte[] m4825(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static final boolean m4826(C3564 c3564) {
        C0823 c0823;
        C0507 c0507 = c3564.f11801;
        C1857 c1857 = (c0507 == null || (c0823 = c0507.f1827) == null) ? null : new C1857(c0823.f2919);
        boolean z = false;
        if (c1857 != null && c1857.f6196 == 1) {
            z = true;
        }
        return !z;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static boolean m4827(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    /* JADX INFO: renamed from: ۦۜ */
    public static final int m4828(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static int m4829(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* JADX INFO: renamed from: ۦۣ */
    public static void m4830(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static final int m4831(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }
}
