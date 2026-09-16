package p000;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۥؘؙۘؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2166 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C5362 f7145;

    /* JADX INFO: renamed from: ۥُ */
    public final boolean f7146;

    /* JADX INFO: renamed from: ۥّ */
    public final C1326 f7147;

    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC2109 f7148;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1946 f7150;

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC5731 f7151;

    /* JADX INFO: renamed from: ۦؚ */
    public final C4696 f7152;

    /* JADX INFO: renamed from: ۦۗ */
    public final C0175 f7155;

    /* JADX INFO: renamed from: ۦۙ */
    public final Object f7156;

    /* JADX INFO: renamed from: ۥۜ */
    public final AtomicReference f7149 = new AtomicReference(EnumC4901.f16159);

    /* JADX INFO: renamed from: ۦٛ */
    public long f7154 = AbstractC3831.m6841();

    /* JADX INFO: renamed from: ۦِ */
    public C3639 f7153 = AbstractC5705.f18789;

    public C2166(C1946 c1946, AbstractC2109 abstractC2109, C5362 c5362, C4657 c4657, InterfaceC5731 interfaceC5731, boolean z, C1326 c1326, Object obj) {
        this.f7150 = c1946;
        this.f7148 = abstractC2109;
        this.f7145 = c5362;
        this.f7151 = interfaceC5731;
        this.f7146 = z;
        this.f7147 = c1326;
        this.f7156 = obj;
        C0175 c0175 = new C0175(0);
        c0175.m373(c4657, c5362.m8955());
        this.f7155 = c0175;
        this.f7152 = new C4696(c1326.f4582);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean m4220() {
        return ((EnumC4901) this.f7149.get()).compareTo(EnumC4901.f16161) >= 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0084 A[Catch: Exception -> 0x0024, TryCatch #2 {Exception -> 0x0024, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0023, B:10:0x0027, B:11:0x002e, B:12:0x002f, B:13:0x0036, B:14:0x0037, B:15:0x0042, B:16:0x0043, B:22:0x006b, B:24:0x007b, B:25:0x007d, B:31:0x00a5, B:33:0x00ad, B:28:0x0084, B:30:0x008a, B:35:0x00b3, B:36:0x00b5, B:38:0x00bb, B:41:0x00c2, B:42:0x00dd, B:19:0x004a, B:21:0x0050, B:46:0x00e5, B:49:0x00f4, B:50:0x00f7, B:51:0x00f9, B:57:0x0121, B:59:0x0129, B:54:0x0100, B:56:0x0106, B:64:0x0134, B:65:0x0137, B:66:0x0138, B:67:0x013f, B:68:0x0140, B:69:0x0147, B:47:0x00ea, B:23:0x006d), top: B:76:0x0004, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad A[Catch: Exception -> 0x0024, TryCatch #2 {Exception -> 0x0024, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0023, B:10:0x0027, B:11:0x002e, B:12:0x002f, B:13:0x0036, B:14:0x0037, B:15:0x0042, B:16:0x0043, B:22:0x006b, B:24:0x007b, B:25:0x007d, B:31:0x00a5, B:33:0x00ad, B:28:0x0084, B:30:0x008a, B:35:0x00b3, B:36:0x00b5, B:38:0x00bb, B:41:0x00c2, B:42:0x00dd, B:19:0x004a, B:21:0x0050, B:46:0x00e5, B:49:0x00f4, B:50:0x00f7, B:51:0x00f9, B:57:0x0121, B:59:0x0129, B:54:0x0100, B:56:0x0106, B:64:0x0134, B:65:0x0137, B:66:0x0138, B:67:0x013f, B:68:0x0140, B:69:0x0147, B:47:0x00ea, B:23:0x006d), top: B:76:0x0004, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0129 A[Catch: Exception -> 0x0024, TRY_LEAVE, TryCatch #2 {Exception -> 0x0024, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0023, B:10:0x0027, B:11:0x002e, B:12:0x002f, B:13:0x0036, B:14:0x0037, B:15:0x0042, B:16:0x0043, B:22:0x006b, B:24:0x007b, B:25:0x007d, B:31:0x00a5, B:33:0x00ad, B:28:0x0084, B:30:0x008a, B:35:0x00b3, B:36:0x00b5, B:38:0x00bb, B:41:0x00c2, B:42:0x00dd, B:19:0x004a, B:21:0x0050, B:46:0x00e5, B:49:0x00f4, B:50:0x00f7, B:51:0x00f9, B:57:0x0121, B:59:0x0129, B:54:0x0100, B:56:0x0106, B:64:0x0134, B:65:0x0137, B:66:0x0138, B:67:0x013f, B:68:0x0140, B:69:0x0147, B:47:0x00ea, B:23:0x006d), top: B:76:0x0004, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[LOOP:1: B:25:0x007d->B:82:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: ۥُ */
    public final boolean m4221(InterfaceC0557 interfaceC0557) throws Exception {
        long j;
        EnumC4901 enumC4901 = EnumC4901.f16158;
        AtomicReference atomicReference = this.f7149;
        try {
            int iOrdinal = ((EnumC4901) atomicReference.get()).ordinal();
            C1946 c1946 = this.f7150;
            AbstractC2109 abstractC2109 = this.f7148;
            EnumC4901 enumC4902 = EnumC4901.f16160;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                    C5362 c5362 = this.f7145;
                    boolean z = this.f7146;
                    if (z) {
                        c5362.f17644 = 0;
                        c5362.f17655 = true;
                    }
                    try {
                        this.f7153 = abstractC2109.mo997(c1946, interfaceC0557, this.f7151);
                        if (z) {
                            c5362.m8960();
                        }
                        EnumC4901 enumC4903 = EnumC4901.f16159;
                        while (!atomicReference.compareAndSet(enumC4903, enumC4902)) {
                            if (atomicReference.get() != enumC4903) {
                                AbstractC0371.m794("Unexpected state change from: " + enumC4903 + " to: " + enumC4902 + '.');
                                if (this.f7153.m6502()) {
                                    m4224();
                                }
                                return m4220();
                            }
                        }
                        if (this.f7153.m6502()) {
                            m4224();
                        }
                        return m4220();
                    } catch (Throwable th) {
                        if (z) {
                            c5362.m8960();
                        }
                        throw th;
                    }
                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                    try {
                        while (!atomicReference.compareAndSet(enumC4902, enumC4901)) {
                            if (atomicReference.get() != enumC4902) {
                                AbstractC0371.m794("Unexpected state change from: " + enumC4902 + " to: " + enumC4901 + '.');
                                j = this.f7154;
                                this.f7154 = AbstractC3831.m6841();
                                this.f7153 = abstractC2109.mo1015(c1946, interfaceC0557, this.f7153);
                                this.f7154 = j;
                                while (!atomicReference.compareAndSet(enumC4901, enumC4902)) {
                                    if (atomicReference.get() != enumC4901) {
                                        AbstractC0371.m794("Unexpected state change from: " + enumC4901 + " to: " + enumC4902 + '.');
                                        if (this.f7153.m6502()) {
                                            m4224();
                                        }
                                        return m4220();
                                    }
                                }
                                if (this.f7153.m6502()) {
                                    m4224();
                                }
                                return m4220();
                            }
                        }
                        this.f7154 = AbstractC3831.m6841();
                        this.f7153 = abstractC2109.mo1015(c1946, interfaceC0557, this.f7153);
                        this.f7154 = j;
                        while (!atomicReference.compareAndSet(enumC4901, enumC4902)) {
                            if (atomicReference.get() != enumC4901) {
                                AbstractC0371.m794("Unexpected state change from: " + enumC4901 + " to: " + enumC4902 + '.');
                                if (this.f7153.m6502()) {
                                    m4224();
                                }
                                return m4220();
                            }
                        }
                        if (this.f7153.m6502()) {
                            m4224();
                        }
                        return m4220();
                    } catch (Throwable th2) {
                        this.f7154 = j;
                        while (!atomicReference.compareAndSet(enumC4901, enumC4902)) {
                            if (atomicReference.get() != enumC4901) {
                                AbstractC0371.m794("Unexpected state change from: " + enumC4901 + " to: " + enumC4902 + '.');
                                throw th2;
                            }
                        }
                        throw th2;
                    }
                    j = this.f7154;
                case C4261.LONG_FIELD_NUMBER /* 4 */:
                    AbstractC5508.m9200("Recursive call to resume()");
                    throw new C1228(5);
                case C4261.STRING_FIELD_NUMBER /* 5 */:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new C1228(6);
            }
        } catch (Exception e) {
            atomicReference.set(EnumC4901.f16165);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m4222() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.f7156) {
                try {
                    this.f7152.m8044(this.f7147, this.f7155);
                    this.f7155.m372();
                    this.f7155.m368();
                    this.f7155.m367();
                    this.f7150.f6421 = null;
                } catch (Throwable th) {
                    this.f7155.m367();
                    this.f7150.f6421 = null;
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4223() throws Exception {
        AtomicReference atomicReference = this.f7149;
        try {
            switch (((EnumC4901) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                case C4261.LONG_FIELD_NUMBER /* 4 */:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case C4261.STRING_FIELD_NUMBER /* 5 */:
                    m4222();
                    EnumC4901 enumC4901 = EnumC4901.f16161;
                    EnumC4901 enumC4902 = EnumC4901.f16162;
                    while (!atomicReference.compareAndSet(enumC4901, enumC4902)) {
                        if (atomicReference.get() != enumC4901) {
                            AbstractC0371.m794("Unexpected state change from: " + enumC4901 + " to: " + enumC4902 + '.');
                            return;
                        }
                    }
                    return;
                case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new C1228(6);
            }
        } catch (Exception e) {
            atomicReference.set(EnumC4901.f16165);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m4224() {
        AtomicReference atomicReference;
        EnumC4901 enumC4901;
        EnumC4901 enumC4902;
        do {
            atomicReference = this.f7149;
            enumC4901 = EnumC4901.f16160;
            enumC4902 = EnumC4901.f16161;
            if (atomicReference.compareAndSet(enumC4901, enumC4902)) {
                return;
            }
        } while (atomicReference.get() == enumC4901);
        AbstractC0371.m794("Unexpected state change from: " + enumC4901 + " to: " + enumC4902 + '.');
    }
}
