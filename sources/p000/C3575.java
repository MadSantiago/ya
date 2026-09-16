package p000;

import java.io.FileOutputStream;

/* JADX INFO: renamed from: ۦؙۧٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3575 extends C1986 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۗ */
    public final Object m6383(Object obj, AbstractC0772 abstractC0772) {
        C4065 c4065;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (abstractC0772 instanceof C4065) {
            c4065 = (C4065) abstractC0772;
            int i = c4065.f13542;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4065.f13542 = i - Integer.MIN_VALUE;
            } else {
                c4065 = new C4065(this, abstractC0772);
            }
        } else {
            c4065 = new C4065(this, abstractC0772);
        }
        Object obj2 = c4065.f13540;
        int i2 = c4065.f13542;
        C2358 c2358 = C2358.f7817;
        if (i2 == 0) {
            AbstractC0186.m409(obj2);
            if (this.f6554.get()) {
                C1078.m2276("This scope has already been closed.");
                return null;
            }
            FileOutputStream fileOutputStream3 = new FileOutputStream(this.f6556);
            try {
                InterfaceC0999 interfaceC0999 = this.f6555;
                C0781 c0781 = new C0781(fileOutputStream3);
                c4065.f13539 = fileOutputStream3;
                c4065.f13538 = fileOutputStream3;
                c4065.f13542 = 1;
                interfaceC0999.mo2180(obj, c0781);
                EnumC2282 enumC2282 = EnumC2282.f7590;
                if (c2358 == enumC2282) {
                    return enumC2282;
                }
                fileOutputStream2 = fileOutputStream3;
                fileOutputStream = fileOutputStream2;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream3;
                throw th;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fileOutputStream2 = c4065.f13538;
            fileOutputStream = c4065.f13539;
            try {
                AbstractC0186.m409(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    AbstractC4554.m7932(fileOutputStream, th);
                    throw th3;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        AbstractC4554.m7932(fileOutputStream, null);
        return c2358;
    }
}
