package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;

/* JADX INFO: renamed from: ۦٚؖٙۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C4571 {

    /* JADX INFO: renamed from: ۥۣ */
    public final Member f15079;

    public C4571(Member member) {
        this.f15079 = member;
    }

    public String toString() {
        return mo3892().toString();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public Member mo3892() {
        return this.f15079;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Annotation[] m7947() {
        if (mo3892() instanceof AnnotatedElement) {
            return ((AnnotatedElement) mo3892()).getDeclaredAnnotations();
        }
        C5028.m8449(this, "Unsupported member type: ");
        return null;
    }
}
