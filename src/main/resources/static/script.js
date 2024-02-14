function startjs() {
   const form = document.getElementsByTagName("form")[0];

   const firstname = document.getElementById("firstName");
   const lastname = document.getElementById("lastName");
   const passport = document.getElementById("passport");
   const sex = document.getElementById("sex");
   const inn = document.getElementById("inn");
   const snils = document.getElementById("snils");
   const wage = document.getElementById("wage");
   const sumcredit = document.getElementById("sumcredit");

   if (form) {
       form.addEventListener("submit", function (event) {
        // Если поле email валдно, позволяем форме отправляться

        if (!firstname.value || !lastname.value || !passport.value || !sex.value || !inn.value ||
            !snils.value || !wage.value || !sumcredit.value) {
            // Если поле email не валидно, отображаем соответствующее сообщение об ошибке
            resultError();
            // Затем предотвращаем стандартное событие отправки формы
            event.preventDefault();
            return;
        }
        if (!isValidpassport(passport.value)) {
            resultError();
            event.preventDefault();
            return;
        }
        if (!isValidinn(inn.value)) {
            resultError();
            event.preventDefault();
            return;
        }
        if (!isValidsnils(snils.value)) {
            resultError();
            event.preventDefault();
            return;
        }
        form.submit();
       });
   }

   function isValidpassport(pvalue) {
       const pattern = /[0-9]{10}/;
       return pattern.test(pvalue);
   }
   function isValidinn(ivalue) {
       const pattern = /[0-9]{12}/;
       return pattern.test(ivalue);
   }
   function isValidsnils(svalue) {
      const pattern = /[0-9]{3}-[0-9]{3}-[0-9]{3}-[0-9]{2}/;
      return pattern.test(svalue);
   }

   function resultError() {
       document.getElementById("invalid-feedback-firstName").style.display = "block";
       document.getElementById("invalid-feedback-lastName").style.display = "block";
       document.getElementById("invalid-feedback-passport").style.display = "block";
       document.getElementById("invalid-feedback-sex").style.display = "block";
       document.getElementById("invalid-feedback-inn").style.display = "block";
       document.getElementById("invalid-feedback-snils").style.display = "block";
       document.getElementById("invalid-feedback-sumcredit").style.display = "block";
       document.getElementById("invalid-feedback-wage").style.display = "block";
   }

};

